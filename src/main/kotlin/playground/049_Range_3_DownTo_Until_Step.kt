package playground

fun main() {
    val myRange1: CharRange = 'c'..'h'
    val myRange2: IntRange = 1..9

    // printing range from large value to small value using downTo
    for (i in 8 downTo 1) {
        println(i)
    }
}