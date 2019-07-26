package _01_GettingStarted._02_Idioms

import _01_GettingStarted._02_Idioms.models.Bar
import _01_GettingStarted._02_Idioms.models.Foo


fun checkObject(x:Any){
    when (x) {
        is Foo -> {
            println("I am Foo.")
        }
        is Bar -> {
            println("I am Bar.")
        }
        else   -> {
            println("I am Unknown.")
        }
    }
}


fun main(){
    // Passing  instance of Bar
    val bar = Bar();
    checkObject(bar)

    // Passing instance of Foo
    val foo = Foo();
    checkObject(foo)

    // Passing instance of String
    val string = String()
    checkObject(string)

}