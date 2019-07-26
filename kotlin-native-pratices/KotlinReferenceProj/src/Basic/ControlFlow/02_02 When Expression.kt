package Basic.ControlFlow

fun parseInt(any:Any):Int{
    return 0;
}

fun main(){

    var x = 5;
    when (x) {
        parseInt("5") -> print("s encodes x")
        else -> print("s does not encode x")
    }
}