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
}
