package playground

fun main() {
    val myMap: Map<Int, String> = mapOf(

        3 to "Apple",
        7 to "Samsung",
        9 to "Asus"
    )

    myMap.forEach() { t, u ->

        println("Key: $t - Value: $u")
    }
    println("---------------")

    myMap.forEach() {

        println("Key: ${it.key} value: ${it.value}")
    }
    println("---------------")

    for (k in myMap.keys)

        println("Key: $k Value: ${myMap[k]}")

    println("---------------")

}