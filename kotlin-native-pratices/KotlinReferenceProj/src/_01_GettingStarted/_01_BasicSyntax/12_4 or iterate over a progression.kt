package _01_GettingStarted._01_BasicSyntax

fun main(){
//or iterate over a progression:
    for (x in 1..10 step 2) {
        print(x)
    }
    println()
    for (x in 9 downTo 0 step 3) {
        print(x)
    }
}