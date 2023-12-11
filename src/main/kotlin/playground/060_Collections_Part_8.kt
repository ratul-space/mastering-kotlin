package playground

import kotlin.coroutines.ContinuationInterceptor

fun main() {
    val myMutableMap: MutableMap<Int, String> = mutableMapOf(

        3 to "Apple",
        7 to "Samsung",
        9 to "Asus"
    )

    myMutableMap[1] = "Air"
    myMutableMap.forEach { t, u ->
        println("K: $t - V: $u")
    }
}