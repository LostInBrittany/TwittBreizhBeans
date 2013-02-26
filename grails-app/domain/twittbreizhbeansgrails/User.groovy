package twittbreizhbeansgrails

import java.security.MessageDigest

class User {

    static mapWith = "mongo"

    static constraints = {
    }

    static mapping = {
        username index:true, indexAttributes: [unique:true, dropDups:true]
    }

    String username
    String password

    static def isUserOk(params) {
        if ((null == params.username) || (null == params.password)) {
            return false
        }

        def theUser = User.findByUsername(params.username)
        def thePassword = MessageDigest.getInstance("MD5")
                            .digest(params.password.getBytes("UTF-8"))
                            .encodeHex().toString()
        if ((null == theUser) || (!theUser.password.equals(thePassword))) {
            return false
        }
        return true
    }

    static def getUserFromParams(params) {
        def userInstance = new User()
        userInstance.username = params.get("username")
        // We don't want the password, we want the hash !
        userInstance.password = MessageDigest.getInstance("MD5").digest(params.get("password")
                .getBytes("UTF-8")).encodeHex().toString()
        return userInstance
    }
}
