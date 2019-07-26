package _01_GettingStarted._02_Idioms


fun printGrade(mark:Int){
    when (mark) {
         80 -> {
            println("A+")
        }
         70 -> {
            println("I am Bar.")
        }
        else   -> {
            println("I am Unknown.")
        }
    }
}


fun main(){
    printGrade(80)

}