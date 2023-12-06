package playground

fun main() {

    val myArr: IntArray = intArrayOf(2, 4, 6, 33)
    val myNumber = 7

    try {
        println(myArr[4])
        val result: Int = myNumber / 2
        println(result)
    } catch (e: ArithmeticException) {
        e.printStackTrace()
        println("Arithmetic Exception ${e.message}")
    } catch (e: ArrayIndexOutOfBoundsException) {
        e.printStackTrace()
        println("Array Index Out Of Bounds Exception ${e.message}")
    } catch (ex: Exception) {
        ex.printStackTrace()
        println("something wrong! ${ex.message}")
    } finally {
        println("Finally done")
    }

    println("The end")

}