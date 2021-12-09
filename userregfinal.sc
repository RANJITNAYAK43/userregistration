import scala.util.matching.Regex
import scala.io.StdIn._
import scala.util.control.Breaks._


object UserReg{

def main (args:Array[String])={

val firstLastName_pattern="^[A-Z][a-z]{3,10}+\\s[A-Z][a-z]+$".r

val pwd_pattern="(?=.*\\d)(?=.*[a-zA-Z])(?=.*[!.@#$%^&]).{8,}$".r
	
val mobil_pattern="^[9][1]\\s\\d{10}$".r

val email_pattern ="[a-z\\.[a-z0-9]{2,}]+@[a-z]{2,3}\\.[a-z]{2,3}\\.[a-z]{2,3}$".r

	

var firstLastInput = readLine("Enter the first name:")
var emailInput = readLine("Enter email id:")
var mobileInput= readLine("Enter mobile number:")
var passInput= readLine("Enter password:")


while(true){
	var x=1

	if((firstLastName_pattern.matches(firstLastInput))&&(email_pattern.matches(emailInput))

	&&(mobil_pattern.matches(mobileInput))&&(pwd_pattern.matches(passInput))){

			println("successfully matched")
			break
		}
	else{
		println("please enter valid input")
		break
	}
	
	x=x+1

	}


	}
}