package playground

fun main() {
    try {
        sumData(2,8)
    }catch (e: ArithmeticException) {
        e.printStackTrace()
    }
  println("End ---")
}

fun sumData(i: Int, j: Int) {
    if (i < 5 ){
        throw ArithmeticException("very small number")
    }

    val r = i + j
    println(r)
}
class MyNewException(a: String) : Exception("My error message.."){

}



