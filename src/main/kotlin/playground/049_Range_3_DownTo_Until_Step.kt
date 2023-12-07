package playground

fun main() {

    // printing range from large value to small value using downTo
    for (i in 8 downTo 1) {
        //println(i)
    }

    // print value range using until
    // in case of until it will print a value less than the max value
    for (j in 1 until 5) {
        //println(j)
    }

    // step
    for (k in 1..20 step 4) {
        //println(k)
    }

    for (h in 10 downTo 1 step 2){
        println(h)
    }
}