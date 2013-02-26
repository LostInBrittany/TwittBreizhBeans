package twittbreizhbeansgrails


class Twitt {

    static mapWith = "mongo"

    static constraints = {
    }

    Date date
    String username
    String content


    static def isTwittOk(params) {
        if ((null == params.username) || (null == params.content)) {
            return false
        }
        return true
    }

}
