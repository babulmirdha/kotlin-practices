package _01_GettingStarted._02_Idioms

import java.io.File

fun main() {
//If not null and else shorthand
    var file = File("Test")

    val files = file.listFiles()

    println(files?.size ?: "empty")

//    println(file.absolutePath)
//    println(file.canonicalPath)
//
//    println(file.absoluteFile)
//    println(file.canonicalFile)
}