package playground

fun main() {
    val myList: List<Any> = listOf<Any>("Dell", "Samsung", "Asus", "Apple", "Dell")
    val myList2: List<Any> = listOf<Any>("Dell")
    myList.forEach() {
        println(it)
    }
    val a: Boolean = myList.contains("Samsung")
    println(a)
    val ca: Boolean = myList.containsAll(myList2)
    println(ca)
    val cac: Any = myList.get(3)
    println(cac)
    val i: Int = myList.lastIndexOf("Dell")
    println(i)
    val e: Any = myList2.isEmpty()
    println(e)
    val m: List<Any> = myList.subList(2, 4)
    m.forEach() {
        println(it)
    }
    val nl: List<Any> = myList.dropLast(n = 2)
    myList.forEach() {
        println(it)
    }
    val mi = myList.listIterator(2)
    while (mi.hasNext())
        println(mi.next())
}



