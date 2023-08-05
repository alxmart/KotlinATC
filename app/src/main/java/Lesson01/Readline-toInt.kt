package Lesson01

fun main() {
    println("=========================================")
    println("Welcome to Android ATC Calculator")
    println("=========================================")

    println("Enter the first number:")
    var x= readLine()!!.toInt()

    println("Enter the Second number:")
    var y = readLine()!!.toInt()

    println("The Sum Result= ${x+y}")
    println("The Multiplication Result=${x*y}")
    println("The Division Result= ${x/y}")

    println("========================================================")}