package playground

fun main() {
    val mal: ArrayList<String> = arrayListOf(
        "Samsung", "Dell", "Apple"
    )
    val mal2: ArrayList<String> = arrayListOf(
        "Dell", "Hp"
    )
    println("My item: ${mal.get(2)}")
    println("Total: ${mal.count()}")
    mal.add("Asus")
//    mal.clear()
    mal.addAll(mal2)
    mal.forEach() {
        println(it)
    }
    println("Last index ${mal.lastIndexOf("Dell")}")

    mal.remove("Hp")
    mal.forEach() {
        println(it)
    }
    val msa: String = mal.toString()
    println(msa)
}
