package playground

fun main() {

    val myCountry: String = "Bangladesh"
//    val myDropString : String = myCountry.drop(4)
    val myDropString: String = myCountry.dropLast(5)
    println(myDropString)

    val myEleAt: Char = myCountry.elementAt(6)
    println(myEleAt)

    val myStrReplace: String = myCountry.replace("Bangla", "arbi")
    println(myStrReplace)

    val mySub1: String = myCountry.substring(3)
    println(mySub1)

    val myName: String = "ratul"
    val myCapName: String = myName.capitalize()
    println(myCapName)

    val myNmeRev: String = myName.reversed()
    println(myNmeRev)

    val name: String? = myName.orEmpty()
    println(name)

    val mySecondNumber: Int = 26
    try {
        val result = mySecondNumber / 0
        println(result)
    } catch (ex: Exception) {
        ex.printStackTrace()
        println("something wrong!")
    } finally {
        println("Finally done")
    }
    println("The end")

}