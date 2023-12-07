package playground

fun main() {
    val myRange1: CharRange = 'b'..'u'
    val myRange2: IntRange = 1..9

    for (i in 8 downTo 2) {
        println(i)
    }
    for (m in 1 until 6) {
        println(m)
    }
    for (b in 1..9 step 2) {
        println(b)
    }

}