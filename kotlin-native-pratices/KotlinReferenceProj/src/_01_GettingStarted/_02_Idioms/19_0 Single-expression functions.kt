package _01_GettingStarted._02_Idioms

fun theAnswer() = 42

//This is equivalent to

fun theAnswerX(): Int {
    return 42
}

//This can be effectively combined with other idioms, leading to shorter code. E.g. with the when-expression:
fun transformX(color: String): Int = when (color) {
    "Red" -> 0
    "Green" -> 1
    "Blue" -> 2
    else -> throw IllegalArgumentException("Invalid color param value")
}