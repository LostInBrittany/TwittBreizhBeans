import java.sql.Timestamp
import java.security.MessageDigest
import twittbreizhbeansgrails.Twitt 
import twittbreizhbeansgrails.User


def user = new User()
user.username = "LostInBrittany"
user.password = MessageDigest.getInstance("MD5").digest("toto".getBytes("UTF-8")).encodeHex().toString()
if (null == User.findByUsername(user.username)) {
    print "User doesn't exist yet, let's create it"
    user.save()
} else {
    print "User already exists, we don't recreate it"
}


for (i=1; i<10; i++) {

    def twitt = new Twitt()
    twitt.username = "LostInBrittany"
    
    if (i==1) {
        twitt.content = "Un éléphant qui se balançait / Sur une toile d'araignée / Trouva ce jeu si intéressant / Qu'il alla chercher un 2ème éléphant"
    } else {
        twitt.content = "$i élephants qui se balançaient / Sur une toile d'araignée / Trouvèrent ce jeu si intéressant / Qu'ils allèrent chercher un ${i+1}ème éléphant"
    }
    twitt.date = new Date()
    twitt.save()
    println "Twitt : ${twitt.date} - ${twitt.username} : ${twitt.content}"
    println "Last 3 twitts by user LostInBrittany" + Twitt.findAllByUsername("LostInBrittany", [max: 3, sort:"date", order:"desc"])
    println "Last twitts"+Twitt.list(sort:"date", order:"desc",max: 2)
}

