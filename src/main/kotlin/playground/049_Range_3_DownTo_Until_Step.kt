package playground

fun main() {
    val myRange1: CharRange = 'c'..'h'
    val myRange2: IntRange = 1..9

    for (i in myRange1) {
        println(i)
    }
}