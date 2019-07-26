package GettingStarted.BasicSyntax

fun main(){
//    Check if a number is within a range using in operator:
    val x = 10
    val y = 9
    if (x in 1..y+1) {
        println("fits in range")
    }
}