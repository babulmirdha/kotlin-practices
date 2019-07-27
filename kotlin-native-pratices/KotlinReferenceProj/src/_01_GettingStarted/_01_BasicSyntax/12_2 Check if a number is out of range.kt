package _01_GettingStarted._01_BasicSyntax

fun main(){
//    Check if a number is out of range:
    val list = listOf("a", "b", "c")

    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }

    if (list.size !in list.indices) {
        println("list size is out of valid list indices range, too")
    }

}