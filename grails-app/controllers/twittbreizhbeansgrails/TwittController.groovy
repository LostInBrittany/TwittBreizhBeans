package twittbreizhbeansgrails

import org.apache.commons.logging.LogFactory

class TwittController {

    // Default and maximum number of twitts to recover
    private def DEFAULT_MAX = 10
    private def TOTAL_MAX = 100

    // Logger
    private static final log = LogFactory.getLog(this)

    private static defaultAction = "list"


    def list() {
        params.max = getMax(params)

        def twittList = Twitt.list(sort: "date", order: "desc", max: params.max)

        log.debug(twittList)

        response.status = 200 //OK
        render(contentType:'text/json') {
            [ list : twittList ]
        }


    }

    def post() {

        if ((!User.isUserOk(params)) || (!Twitt.isTwittOk(params))) {
            log.info("Wrong set of parameters: "+ params)
            response.status = 401 //Forbidden
            render(contentType:'text/json') {
                [ message : "Wrong set of parameters: "+ params ]
            }
        }
        def twitt = new Twitt(params)
        twitt.date = new Date()
        def result = twitt.save()
        response.status = 200 //OK
        render(contentType:'text/json') {
            [ twitt : twitt ]
        }
    }

    private def getMax(params) {
        def max = DEFAULT_MAX
        if ((null != params.max) && (params.max.toString().isInteger())) {
            if (Integer.parseInt(params.max) < 1) {
                max = 1
            } else if (Integer.parseInt(params.max) <= TOTAL_MAX) {
                max = TOTAL_MAX
            } else {
             max = Integer.parseInt(params.max)
            }
        }
        return max
    }

}
