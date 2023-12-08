package playground

fun main() {
    val myRange1: IntRange = IntRange(2, 8)
    myRange1.forEach() {
        println(it)
    }
    println("--------------------")
    val myRange: IntRange = 2.rangeTo(9)
    myRange.forEach() {
        println(it)
    }
    println("--------------------")
    val myRange2: IntProgression = 9.downTo(3)
    myRange2.forEach() {
        println(it)
    }
    println("--------------------")

    val myRev = myRange2.reversed()
    myRev.step(3).forEach() {
        println(it)
    }

    val firstNumber = myRange2.first
    val lastNumber = myRange2.last

    println("First Number $firstNumber \nLast Number $lastNumber")
//    println("Last Number $lastNumber")


}

