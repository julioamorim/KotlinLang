package io.julioamorim.kotlinlang

data class Person(
    val name: String,
    val age: Int? = null //valor default para  argumento
)

fun main(args: Array<String>) {
    val persons = listOf(Person("Laura", ), Person("Júlio", 28))
    val oldest = persons.maxOf { it.age ?: 0 }

    println("A pessoa mais velha é $oldest")
}