package _02_Basic._03_ControlFlow

fun main(){

    var x = 5;
    when (x) {
        0, 1 -> print("x == 0 or x == 1")
        else -> print("otherwise")
    }
}