#4/100

Today I wanted to practice collections in Kotlin, so I created 1 little project
for each one of them (Sets, Lists and Maps).

What I learned:

-Maps have a syntax different from what I'm used to, but it's still easy to use

- There's no need to use ".toString()" after a "readln()"
- There's no ternary operator. Even though the lint didn't complain, I received
  the following error when trying to create the binary file (.jar):

  "collections.kt:25:35: error: syntax error: Unexpected tokens (use ';' to
  separate expressions on the same line). running = answer == 1 ? true : false"
