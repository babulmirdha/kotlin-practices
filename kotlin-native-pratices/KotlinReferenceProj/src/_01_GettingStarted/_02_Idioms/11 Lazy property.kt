package _01_GettingStarted._02_Idioms


class LazyProperty(val initializer: () -> Int) {
    var value: Int? = null
    val lazy: Int
        get() {
            if (value == null) {
                value = initializer()
            }
            return value!!
        }
}


fun main() {
//    val p: String by lazy {
//        // compute the string
//    }
}