fun main() {
    var running = true

    val fruits = mutableMapOf("apple" to 10, "banana" to 8, "orange" to 6)
    val lockedFruitMap = fruits

    while (running) {
        println("Fruits:")

        lockedFruitMap.forEach() { println("- ${it.key}") }

        println()
        println("Type the fruit to see it's price (or exit to leave)")
        val answer = readln()

        if (lockedFruitMap.containsKey(answer)) {
            println("The price of $answer is $${lockedFruitMap["$answer"]}")
        } else if (answer == "exit") {
            running = false
        } else {
            println("Invalid input")
        }
    }
}
