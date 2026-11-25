#8/100

Found out that the error I was facing yesterday was caused because I was trying
to convert a String to a Byte by using the method `.toByte()`, but it doesn't
work with `String` type. I don't know why my linter didn't warn me. I'd better
check if I did the settings properly.

Instead of using `.toByte()`, now I'm using `.hashCode()` on the `String`s

Tested again the equality operators by adding a list in the class, then created
2 objects, with the same attributes but the values inside the list. When the
list has the same values, it returns true, and when the values are different, it
returns false.

I wanted to make sure that it works that way because it's important in Flutter
when creating AppStates using BLoC. I guess Kotlin has something similar. The
results of my tests are below:

```
val user1 = User(1, "John", "john@email.com", mutableListOf(1)) //DIFFERENT
val user2 = User(1, "John", "john@email.com", mutableListOf(2)) //DIFFERENT

// -- RESULT -- 
// Are equal(==)? false
// Are equal(equals)? false
// User1 hashcode: 1630827248
// User2 hashcode: 1630827249
```

```
val user1 = User(1, "John", "john@email.com", mutableListOf(1)) //EQUAL
val user2 = User(1, "John", "john@email.com", mutableListOf(1)) //EQUAL

// -- RESULT -- 
// Are equal(==)? true
// Are equal(equals)? true
// User1 hashcode: 1630827248
// User2 hashcode: 1630827248
```

What I learned today:

- `is` for type check
- Data class' equality operator checks even the contents of lists
