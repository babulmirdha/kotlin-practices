package Basic.ControlFlow

fun hasPrefix(x: Any) = when(x) {
    is String -> x.startsWith("prefix")
    else -> false
}

fun main(){

//    var x = 5;
//    when {
//        x.isOdd() -> print("x is odd")
//        x.isEven() -> print("x is even")
//        else -> print("x is funny")
//    }

}