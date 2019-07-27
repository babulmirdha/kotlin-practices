package _01_GettingStarted._02_Idioms

class Turtle {
    fun penDown() {}
    fun penUp() {}
    fun turn(degrees: Double) {}
    fun forward(pixels: Double) {}
}


fun main() {
//    Calling multiple methods on an object instance (with)
    val myTurtle = Turtle()
    with(myTurtle) {
        //draw a 100 pix square
        penDown()
        for (i in 1..4) {
            forward(100.0)
            turn(90.0)
        }
        penUp()
    }

}