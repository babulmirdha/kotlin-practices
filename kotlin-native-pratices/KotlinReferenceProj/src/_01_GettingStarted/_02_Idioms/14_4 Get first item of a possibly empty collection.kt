package _01_GettingStarted._02_Idioms


fun main() {
//    Executing a statement if null
//    val emails = listOf<String>()
    val emails = listOf<String>("babumirdha@gmail.com")
    val mainEmail = emails.firstOrNull() ?: "No email"
    println(mainEmail)
}