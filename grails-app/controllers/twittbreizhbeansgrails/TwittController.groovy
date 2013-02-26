package twittbreizhbeansgrails

import org.apache.commons.logging.LogFactory

class TwittController {

    // Default and maximum number of twitts to recover
    private def DEFAULT_MAX = 10
    private def TOTAL_MAX = 100

    // Logger
    private static final log = LogFactory.getLog(this)

    def index() { }


    def list() {
        params.max = getMax(params)

        def twitList = Twitt.list(sort: "date", order: "desc", max: params.max)

        log.debug(twitList)


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
