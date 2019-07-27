package _01_GettingStarted._02_Idioms

fun main() {

    println("Read only list:")
//    Read-only list
    val list = listOf("a", "b", "c")

    list.forEach { it ->
        println(it)
    }
    println("Read only map:")
// Read-only map
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    map.forEach { k, v ->
        println("$k->$v")
    }
}