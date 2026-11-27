#10/100

Today I reviewed the 2 scope methods `let` and `apply`

`let` is used to perform null checks and do some other operation with that
object after

`apply` is used to initiate objects and use it's methods. I'll leave an example
below so I can remember when reviewing later

```
val client = Client().apply {
    token = "asdf"
    connect()
    // connected!
    authenticate()
    // authenticated!
}
```
