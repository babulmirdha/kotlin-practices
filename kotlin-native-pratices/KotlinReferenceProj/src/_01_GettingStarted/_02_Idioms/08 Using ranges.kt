package _01_GettingStarted._02_Idioms

fun main() {

    println("1..10:")
    for (i in 1..10) {
        println(i)
    }  // closed range: includes 100

    println("1 until 10:")
    for (i in 1 until 10) {
        println("$i")
    } // half-open range: does not include 100

    println("x in 2..10 step 2:")
    for (x in 2..10 step 2) {
        println("$x")
    }

    println("x in 10 downTo 1:")
    for (x in 10 downTo 1) {
        println("$x")
    }
    println("x in 1..10:")
    val x = 4
    if (x in 1..10) {
        println("$x")
    }
}