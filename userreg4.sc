import scala.util.matching.Regex
import scala.io.StdIn._

object UserReg{

def main (args:Array[String])={

val pattern:Regex="^[9][1]\\s\\d{10}$".r

val mobileInput = readLine("mobile enter shoulde be (91 9009008888): ")

println((pattern findAllIn mobileInput).mkString(","))


}
}