
fun main() {
    println("-=-==-==-=-=-=-=-=-=-=-=-=-=-")
	println("-=-   KOTLIN CALCULATOR   -=-")
	println("-=-==-==-=-=-=-=-=-=-=-=-=-=-")
	println()
	println("Choose an operation:")
	println("1: addition")
	println("2: subtraction")
	println("3: multiplication")
	println("4: division")
    val operation = readln().toInt()

	println("Input the value of the first number")
    val firstNumber = readln().toFloat()

	println("Now, input the valor of the second number")
	val secondNumber = readln().toFloat()
    
    var result: Float = 0f
    
    when(operation){
        1-> result = firstNumber + secondNumber
        2-> result = firstNumber + secondNumber
        3-> result = firstNumber + secondNumber
        4-> result = firstNumber + secondNumber
        else -> {
            println("Invalid operation")
        }
    }
    println("Result: $result")

}