package GettingStarted.BasicSyntax

fun main(){
//    Checking if a collection contains an object using in operator:

    val items = listOf("orange", "apple", "banana")

    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }
}