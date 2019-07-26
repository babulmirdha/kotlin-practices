package GettingStarted.Idioms

fun foo(a: Int = 0, b: String = "") {
    println("a= $a")
}

fun main(){
    foo(5)
}