package _01_GettingStarted._02_Idioms

fun main() {
    val value = null

//    val mapped = value?.let { transformValue(it) } ?: defaultValueIfValueIsNull
    val mapped = value?.let { transformValue(it) } ?: println("value is null")

    println(mapped)
}

fun transformValue(it: Any) {

}
