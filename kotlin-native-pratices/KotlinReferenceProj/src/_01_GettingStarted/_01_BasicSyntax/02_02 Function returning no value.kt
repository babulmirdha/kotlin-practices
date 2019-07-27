package _01_GettingStarted._01_BasicSyntax


// Function returning no  value:
fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}


fun main() {

    printSum(3, 4)

}