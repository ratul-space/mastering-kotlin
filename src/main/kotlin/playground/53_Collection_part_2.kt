package playground

fun main() {
    val myList: List<Any> = listOf<Any>("Dell", "Samsung", "Asus", "Apple", "Dell")
    myList.forEach() {
        println(it)
    }
    val a: Boolean = myList.contains("Samsung")
    println(a)
}