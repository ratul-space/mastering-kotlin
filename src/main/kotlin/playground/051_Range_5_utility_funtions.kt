package playground

fun main() {
    val myRange1: IntRange = IntRange(2,8)
    myRange1.forEach(){
        println(it)    }

    val myRange: IntRange = 2.rangeTo(9)
    myRange.forEach(){
        println(it)
    }
}

