package playground

fun main() {

    // Kotlin range iterator

    val mChars: CharRange = 'a'..'e'
    val c: CharIterator = mChars.iterator()

    while (c.hasNext()) {
        val mValue: Char = c.next()
        println(mValue)
    }

}