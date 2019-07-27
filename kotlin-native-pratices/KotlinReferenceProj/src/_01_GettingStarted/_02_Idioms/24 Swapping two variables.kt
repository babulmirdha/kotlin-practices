package _01_GettingStarted._02_Idioms

fun main() {
    var a = 1
    var b = 2
    a = b.also { b = a }

}