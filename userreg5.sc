import scala.util.matching.Regex
import scala.io.StdIn._

object UserReg{

def main (args:Array[String])={

val pattern="(?=.*\\d)(?=.*[a-zA-Z])(?=.*[!.@#$%^&]).{8,}$".r

val pwdInput = readLine("enter password: ")

println((pattern findAllIn pwdInput).mkString(""))


}
}