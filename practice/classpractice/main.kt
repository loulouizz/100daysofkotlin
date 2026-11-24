import classes.*

fun main() {
    val user1 = User(1, "John", "john@email.com")
    val user2 = User(2, "Peter", "peter@email.com")
    val user3 = User(1, "John", "john@email.com")

    println("User 1: ${user1.toString()}")
    println("User 2: ${user2.toString()}")
    println("User 3: ${user2.toString()}")
    println("Are equal(==)? ${user1 == user3}")
    println("Are equal(equals)? ${user1.equals(user3)}")
    println("User1 hashcode: ${user3.hashCode()}")
    println("User2 hashcode: ${user2.hashCode()}")
}
