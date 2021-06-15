fun main (){
	var mScore: Int = 70
	var eScore: Int = 60
	var cScore: Int = 50
	var pScore: Int = 40
	var gScore: Int = 30
	
	if (mScore >= 70)
	
	if (eScore >= 60)
	
	if (cScore >= 50)
	
	if (pScore >= 40)
	
	if (gScore >= 30)
	
	println ("Your grade is A")
	
	println ("Your grade is B")
	
	println ("Your grade is C")

	println ("Your grade is D")
	
	println ("Your grade is F")
	
    var num1 = 4
    var num = when(num1) {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        4 -> "Four"
        5 -> "Five"
        else -> "invalid number"
    }
    println("You provide $num")
    
    var number = 1
    when(number) {
        1 -> {
            println("Monday")
            println("First day of the week")
        }
        7 -> println("Sunday")
        else -> println("Other days")
    }
    var num2 = 8
    when(num2) {
        3, 4, 5, 6 ->
            println("It is summer season")
        7, 8, 9 ->
            println("It is rainy season")
        10, 11 ->
            println("It is autumn season")
        12, 1, 2 ->
            println("It is winter season")
        else -> println("invalid input")
    }

    var num3 = 7
    when(num3) {
        in 1..5 -> println("Input is provided in the range 1 to 5")
        in 6..10 -> println("Input is provided in the range 6 to 10")
        else -> println("none of the above")
    }

 var grade = 10
    when(grade) {
        80, 75, 70, 90 ->
            println("Grade A")
        50, 55, 59 ->
            println(" Grade C")
        60, 65, 69 ->
            println(" Grade B")
        40, 45, 49 ->
            println("Grade D")
        else -> println(" Grade F")
    }

}






