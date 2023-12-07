package playground

fun main() {
    val myArray = intArrayOf(3, 5, 6, 74)
    val myNumber: Int = 8
    try {
        try {
            println(myArray[4])
        } catch (e: ArrayIndexOutOfBoundsException) {
            e.printStackTrace()
        }
        val result: Int = (myNumber / 0)
        println(result)

    } catch (ex: ArithmeticException) {
        ex.printStackTrace()
        println("something wrong! ${ex.message}")

    }

}