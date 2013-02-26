package twittbreizhbeansgrails

import org.apache.commons.logging.LogFactory

import java.security.MessageDigest

class UserController {


    // Logger
    private static final log = LogFactory.getLog(this)

    // Only one instance of the controller ever exists (recommended for actions as methods)
    static scope = "singleton"

    static allowedMethods = [create: ["POST","GET"], authenticate : ["POST","GET"]]

    def index() {
        redirect(action: "authenticate", params: params)
    }


    def create() {
        if (User.findAllByUsername(params.get("username")).size() > 0) {

            log.info("User '"+ params.get("username")+"' already exists in base")
            response.status = 403 //Forbidden
            render(contentType:'text/json') {
                [ message : "User '"+ params.get("username")+"' already exists in base" ]
            }

        } else {

            def userInstance =  getUserFromParams(params)
            userInstance.save()
            log.info("User '"+ params.get("username")+"' created")
            response.status = 200 //OK
            render(contentType:'text/json') {
                [ message : "User '"+ params.get("username")+"' created" ]
            }
        }
    }

    def authenticate() {
        def userInstance =  getUserFromParams(params)

        def userOnBase = User.findByUsername(params.get("username"))

        if (null == userOnBase) {

            log.info("User '"+ params.get("username")+"' doesn't exists")
            response.status = 401 //Unauthorized
            render(contentType:'text/json') {
                [ message : "User '"+ params.get("username")+"' doesn't exists" ]
            }

        } else if (userInstance.password.equals(userOnBase.password)) {

            log.info("User '"+ params.get("username")+"' authenticated")
            response.status = 200 //Ok
            render(contentType:'text/json') {
                [ message : "User '"+ params.get("username")+"' authenticated" ]
            }

        } else {

            log.info("Password didn't match for user '"+ params.get("username")+"'")
            response.status = 401 //Unauthorized
            render(contentType:'text/json') {
                [ message : "Password didn't match for user '"+ params.get("username")+"'" ]
            }

        }
    }

    private def getUserFromParams(params) {
        def userInstance = new User()
        userInstance.username = params.get("username")
        // We don't want the password, we want the hash !
        userInstance.password = MessageDigest.getInstance("MD5").digest(params.get("password").getBytes("UTF-8")).encodeHex().toString()
        return userInstance
    }
}