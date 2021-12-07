import scala.util.matching.Regex
import scala.io.StdIn._

object UserReg{

def main (args:Array[String])={
	val pattern="^[A-Z][a-z]{3,10}+\\s[A-Z][a-z]+$".r

	val nameInput = readLine("first and last name start is: ")

	println((pattern findAllIn nameInput).mkString(" "))


	}
}