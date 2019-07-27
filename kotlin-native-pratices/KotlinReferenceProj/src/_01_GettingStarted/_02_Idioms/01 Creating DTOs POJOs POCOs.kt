package _01_GettingStarted._02_Idioms

//Creating DTOs (POJOs/POCOs)

data class Customer(val name: String, val email: String)

/**
provides a Customer class with the following functionality:

getters (and setters in case of vars) for all properties
equals()
hashCode()
toString()
copy()
component1(), component2(), …, for all properties (see Data classes)
 */

fun main(){

    val customer: Customer = Customer("Mr. Jhon", "jhon@gmail.com")

    println(customer.name)


}