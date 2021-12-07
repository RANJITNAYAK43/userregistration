import scala.util.matching.Regex
import scala.io.StdIn._

object UserReg{

def main (args:Array[String])={
	val pattern ="[a-z\\.[a-z0-9]{2,}]+@[a-z]{2,3}\\.[a-z]{2,3}\\.[a-z]{2,3}$".r

	val emailInput = readLine("enter email: ")

	println((pattern findAllIn emailInput).mkString(""))


	}
}