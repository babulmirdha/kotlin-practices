package _01_GettingStarted._02_Idioms

fun main() {
//    Executing a statement if null
    val values = mapOf("email" to null)
    val email = values["email"] ?: throw IllegalStateException("Email is missing!")
}