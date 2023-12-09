package playground

fun main() {
    val myList: List<Any> = listOf<Any>("Dell", "Samsung", "Asus", "Apple", "Dell")
    val myList2: List<Any> = listOf<Any>("Dell", "Samsung", "Asus")
    myList.forEach() {
        println(it)
    }
    val a: Boolean = myList.contains("Samsung")
    println(a)
    val ca: Boolean = myList.containsAll(myList2)
    println(ca)
    val cac: Any = myList.get(3)
    println(cac)
}



