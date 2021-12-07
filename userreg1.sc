import scala.util.matching.Regex
import scala.io.StdIn._

object UserReg{

def main (args:Array[String])={

val pattern:Regex="^[A-Z][a-z]{2}".r

val nameInput = readLine("What's your  first name? ")

println((pattern findAllIn nameInput).mkString(" "))



}
}
