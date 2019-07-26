package Basic.ControlFlow



fun main(){

    var x = 5;

    val validNumbers = listOf(7,65,4,37)

    when (x) {
        in 1..10 -> print("x is in the range")
        in validNumbers -> print("x is valid")
        !in 10..20 -> print("x is outside the range")
        else -> print("none of the above")
    }

}