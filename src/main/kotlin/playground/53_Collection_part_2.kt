package playground

fun main() {
//    val myList: MutableSet<Any> = mutableListOf() Of<Any>("Dell", "Samsung", "Asus", "Apple", "Dell")
//    val myList2: List<Any> = listOf<Any>("Dell")
//    myList.forEach() {
//        println(it)
//    }
//    val a: Boolean = myList.contains("Samsung")
//    println(a)
//    val ca: Boolean = myList.containsAll(myList2)
//    println(ca)
////    val cac: Any = myList.get(3)
//    println(cac)
//    val i: Int = myList.lastIndexOf("Dell")
//    println(i)
//    val e: Any = myList2.isEmpty()
//    println(e)
////    val m: List<Any> = myList.subList(2, 4)
//    m.forEach() {
//        println(it)
//    }
//    val nl: List<Any> = myList.dropLast(n = 2)
//    myList.forEach() {
//        println(it)
//    }
//    val mi = myList.setIterator(2)
//    while (mi.hasNext())
//        println(mi.next())
//    println()

    val mySet: MutableSet<Any> = mutableSetOf(1, 3, 5, "microsoft", "apple", "dell", "hp")
    val mySet2: MutableSet<Any> = mutableSetOf("samsung", 64, 83)
    mySet.forEach {
        println(it)
    }
    println("------------1")

    mySet.add("asus")
    mySet.forEach() {
        println(it)
    }
    println("--------------2")

    mySet.clear()
    mySet.addAll(mySet2)
    mySet.forEach() {
        println(it)
    }
}



