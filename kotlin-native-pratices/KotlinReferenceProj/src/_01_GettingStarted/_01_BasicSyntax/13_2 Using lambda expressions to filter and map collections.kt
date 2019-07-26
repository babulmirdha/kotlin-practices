package _01_GettingStarted._01_BasicSyntax

fun main(){
//   Using lambda expressions to filter and map collections:

    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach { println(it) }
}