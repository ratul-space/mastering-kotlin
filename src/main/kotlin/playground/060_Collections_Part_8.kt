package playground

import kotlin.coroutines.ContinuationInterceptor

fun main() {
    val myMutableMap: MutableMap<Int, String> = mutableMapOf(


        3 to "Apple",
        7 to "Samsung",
        9 to "Asus"
    )
    val myMap: Map<Int, String> = mapOf(

        2 to "Fan",
        5 to "AC"
    )

    myMutableMap.putAll(myMap)

    myMutableMap.remove(2)

    myMutableMap[1] = "Air"

    myMutableMap.clear()
//    myMutableMap.put(1, "Air")

    myMutableMap.forEach { t, u ->

        println("K: $t - V: $u")

    }
}