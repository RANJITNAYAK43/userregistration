import scala.util.Random
import scala.util.control.Breaks._

object WagesProgram{

def main(args:Array[String])={
println("Welcome to scala program")

val partTime=1
val fullTime=2
val wagePerHour=20
val workingDays=20

val maxWorkingHours=100
val maxWorkDay=20
var totalWorkHours=0

var workingHours=0
var totalWage=0

var day=1

for(day<- 1 to workingDays if day<=maxWorkDay 
	if totalWorkHours<maxWorkingHours){
totalWorkHours+=workingHours


val empType=(Math.random()*100) % 3


   empType match {

	case fullTime if fullTime>=2 =>
		println("Employee is Present and full time")
		workingHours=8
		
	case partTime if partTime>=1 =>
		println("Employee is Present and Part time")
		workingHours=4
		
	case _=>
		workingHours=0
		println("Employee is absent");
		
		

	}


var wage=workingHours*wagePerHour
println("Day:"+day+" Employee daily wage is:"+wage+"woking hour is:"+workingHours+
"Total Working hour is:"+(totalWorkHours+workingHours))
totalWage+=wage
}

println("Total wage for month is:"+totalWage)
}

}