package _01_GettingStarted._02_Idioms

fun main() {
    val result = try {
        count()
    } catch (e: ArithmeticException) {
        throw IllegalStateException(e)
    }

    // Working with result

    println(result)

}

fun count(): Int? {
    return throw ArithmeticException()
}

