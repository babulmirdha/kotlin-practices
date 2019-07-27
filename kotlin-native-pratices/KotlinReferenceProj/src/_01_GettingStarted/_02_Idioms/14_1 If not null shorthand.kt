package _01_GettingStarted._02_Idioms

import java.io.File

fun main() {
    val files = File("Test").listFiles()

    println(files?.size)
}