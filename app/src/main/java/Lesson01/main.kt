package Lesson01

var x = 1
val y = 3
//var x = 1
//val y = 1
fun main() {
    //println("Hello, Android")
    //val z = x + y
    //println("Valor de Z é: $z")
    println("Welcome to Android")
    //test()
    x = 4
    println("Now, the value of X is: $x")

//=====================
// Kotlin Data Types:
//=====================

    // String
    val name: String = "Homer"
    var nome = "Zé Ruela"
    println("Name: $name")
    println("Name: $nome")

    // Char
    val moeda: Char = '$'
    println("Meu salário é em C$moeda")

    // Boolean
    var isWarm: Boolean = true
    println("Está calor hoje ? $isWarm")

    // Byte  - 8 bits (0 - 255) 0
    var bx: Byte = 9
    var by: Byte = 5
    var bz= bx + by
    println("bz vale: $bz")

    // Short  - 16 bits (-32768 - 32768)

    // Int  - 32 bits (-2,147,483,648 -> +2,147,483,647) 0
    var i1: Int = 9
    var i2: Int = 6
    var zint: Int = i1 + i2
    println("zint: $zint")

    // Long  - 64 bit   /  0L

    // Float - 32 bit    /  0.0F
    var priceFloat: Float = 2.99F
    println("Price (float) is: $priceFloat")

    // Double  - 64 bits 0.0D
    var price: Double = 9.25
    var tax = 0.05
    println("Price (double) is $price and tax is $tax")

    // Null value:
    //--------------------------------
    var firstName: String? = null
    println("First name: $firstName")

    firstName = "Homer"
    println("First name: $firstName")

    // Arrays:
    var vetor = arrayOf(5, 7, 9)

    println("vetor[0]: ${vetor[0]}")
    println("vetor[1]: ${vetor[1]}")
    println("vetor[2]: ${vetor[2]}")

    var vetorInt: IntArray = intArrayOf(5, 7, 9)

    println("vetorInt[0]: ${vetorInt[0]}")
    println("vetorInt[1]: ${vetorInt[1]}")
    println("vetorInt[2]: ${vetorInt[2]}")

    var inverno = arrayOf("Jul", "Ago", "Sep") // implicity String

    var ABC = arrayOf('A', 'B', 'C') // implicity Char

    for (i in 0..2) {
        println(inverno[i])
    }

    for (i in 0..2) {
        println(ABC[i])
    }

    // Data type conversions
    //-------------------------
    val k: Int = 55
    val l: Short = k.toShort()
    println("K (Int): $k")
    println("L (Short) : $l")

// toByte()
// toShort()
// toLong()
// toInt()
// toFloat()
// toDouble()
// toChar()
}

fun test() {
    println("Hello Kotlin Devs")
}
