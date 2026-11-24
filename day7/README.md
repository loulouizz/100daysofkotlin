#7/100

Today I continued studying about classes. Created a data class and tested it's
built-in functions (equals, bytecode, ==, copy).

By default, if two instances of a data class have the same values in their
atributes, the hashcode, and consequently, "==" and ".equals()" return true.

User 1: User(id=1, name=John, email=john@email.com) User 2: User(id=2,
name=Peter, email=peter@email.com) User 3: User(id=2, name=Peter,
email=peter@email.com) Are equal(==)? true Are equal(equals)? true User1
hashcode: -1609960656 User2 hashcode: -1609960656

I decided to override the "hashCode" getter making it calculate a different
value everytime it runs by adding "LocalDateTime.now().nano" to the expression

"data class User( val id: Int, var name: String, var email: String, ) {

    override fun hashCode(): Int {
        return id + name.toByte() + email.toByte() + LocalDateTime.now().nano
    }

}"

And with that getter overrided, I suppose that the result of the comparation
methods will change aswell, but I'm facing an unexpected error that I'll have to
solve tomorrow:

"User 1: User(id=1, name=John, email=john@email.com) User 2: User(id=2,
name=Peter, email=peter@email.com) User 3: User(id=2, name=Peter,
email=peter@email.com) Exception in thread "main"
java.lang.NumberFormatException: For input string: "John" Are equal(==)? true
Are equal(equals)? true at
java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
at java.base/java.lang.Integer.parseInt(Integer.java:668) at
java.base/java.lang.Byte.parseByte(Byte.java:193) at
java.base/java.lang.Byte.parseByte(Byte.java:219) at
classes.User.hashCode(user.kt:12) at MainKt.main(main.kt:13) at
MainKt.main(main.kt)"
