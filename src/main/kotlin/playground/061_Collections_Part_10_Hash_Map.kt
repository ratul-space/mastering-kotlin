package playground

fun main() {

    val myHashMap: HashMap<Int, String> = hashMapOf(
        4 to "apple",
        5 to "banana",
        1 to "mango",
        3 to "sweet"
    )
    myHashMap.forEach { t, u ->
        println("K: $t V: $u")
    }
    println("total: ${myHashMap.count()}")

}




