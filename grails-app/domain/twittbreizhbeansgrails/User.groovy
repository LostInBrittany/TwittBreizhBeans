package twittbreizhbeansgrails

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

        def user = User.findByUsername(params.username)
        if ((null == user) || (!user.password.equals(params.password))) {
            return false
        }
        return true
    }
}
