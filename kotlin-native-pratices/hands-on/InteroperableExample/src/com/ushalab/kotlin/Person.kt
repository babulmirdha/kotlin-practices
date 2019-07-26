package com.ushalab.kotlin

data class Person(val fistName: String, val lastName: String)


fun Person.getFullName():String{
    return "$fistName $lastName";
}