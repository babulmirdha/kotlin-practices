package _01_GettingStarted._02_Idioms

fun main() {

    var map = mapOf("name" to "Luke", "age" to "23")

    for ((k, v) in map) {
        println("$k -> $v")
    }
//    k, v can be called anything.
}