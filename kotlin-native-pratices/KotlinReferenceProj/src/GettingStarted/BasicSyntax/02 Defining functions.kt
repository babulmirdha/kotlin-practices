package GettingStarted.BasicSyntax

// Function having two Int parameters with Int return type:

fun add(a: Int, b: Int): Int {
    return a + b
}

//Function with an expression body and inferred return type:

fun subtract(a: Int, b: Int) = a-b;

// Function returning no  value:
fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

//Unit return type can be omitted:
fun printSumX(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}

fun main(){
add(5,3)

    subtract(4,3)
    printSum(3,4)
    printSumX(3,4)

}