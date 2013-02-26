import java.sql.Timestamp
import java.security.MessageDigest
import twittbreizhbeansgrails.Twitt 
import twittbreizhbeansgrails.User


def twitt = new Twitt()
twitt.username = "Tu"
twitt.content = "Another!"
twitt.date = new Date()
twitt.save()

println "Twitt by Username Horacio" + Twitt.findAllByUsername("Horacio", [max: 3, sort:"date", order:"desc"])
println Twitt.list(sort:"date", order:"desc",max: 2)


def unhashedPassword = "toto"
def user = new User()
user.username = "Horacio"
user.password = MessageDigest.getInstance("MD5").digest(unhashedPassword.getBytes("UTF-8")).encodeHex().toString()
user.save()
println user.password
println User.findAllByUsername("Horacio")
println User.list()