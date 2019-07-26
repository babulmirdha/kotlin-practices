package _02_Basic._03_ControlFlow

fun main(){
    val a:Int=5;
    val b:Int=3

    val max = if (a > b) {
        print("Choose a")
        a
    } else {
        print("Choose b")
        b
    }

//    If you're using if as an expression rather than a statement
//    (for example, returning its value or assigning it to a variable),
//    the expression is required to have an else branch.


}