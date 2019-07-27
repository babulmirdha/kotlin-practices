package _01_GettingStarted._02_Idioms

fun transform(color: String): Int {
    return when (color) {
        "Red" -> 0
        "Green" -> 1
        "Blue" -> 2
        else -> throw IllegalArgumentException("Invalid color param value")
    }
}


fun main(){
    print(transform("Red"))
}