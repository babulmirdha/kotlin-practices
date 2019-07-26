package _01_GettingStarted._01_BasicSyntax

//A reference must be explicitly marked as nullable when null value is possible.

//Return null if str does not hold an integer:

fun parseInt(any: Any): Int? {

    when(any){
        is Int ->{
            return any
        }
        else ->{
            return null
        }
    }
}


//Use a function returning nullable value:

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    // Using `x * y` yields error because they may hold nulls.
    if (x != null && y != null) {
        // x and y are automatically cast to non-nullable after null check
        println(x * y)
    }
    else {
        println("either '$arg1' or '$arg2' is not a number")
    }
}

// Or
fun printProductX(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)
    if (x == null) {
        println("Wrong number format in arg1: '$arg1'")
        return
    }
    if (y == null) {
        println("Wrong number format in arg2: '$arg2'")
        return
    }

// x and y are automatically cast to non-nullable after null check
    println(x * y)

}

/**
 * See Null-safety.
        */