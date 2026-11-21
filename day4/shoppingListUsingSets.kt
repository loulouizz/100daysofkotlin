fun main() {
    var running = true
    val shoppingList: MutableSet<String> = mutableSetOf()

    while (running) {
        if (shoppingList.isNotEmpty()) {
            println("Today's shopping list:")
            shoppingList.forEach { println("- $it") }
            println()

            println("Would you like to add something?")
            println("(type exit if you finished adding everything)")
            val answer = readln()
            if (answer == "exit") running = false else shoppingList.add(answer)
        } else {
            println("Today's shopping list is empty. What should we add?")
            val shoppingItem = readln().toString() // verificar se funciona sem .toString depois
            shoppingList.add(shoppingItem)

            /*
            println("Great! Would you like to add something else?")
            println("0 - NO     1 - YES")
            val answer = readln().toInt()
            if (answer == 1) running = true else running = false
            */
        }
    }
}
