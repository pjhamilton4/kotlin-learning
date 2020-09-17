
fun sayHello(greeting:String, itemToGreet:String) = println("$greeting $itemToGreet")

fun main(){
    val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")

    println(interestingThings.size)

    println(interestingThings[0])
    println(interestingThings.get(0))

    for(interestingThing in interestingThings){
        println(interestingThing)
    }

    interestingThings.forEach { it:String ->
        println(it)
    }

    interestingThings.forEachIndexed{ index: Int, s: String ->
        println("$index $s")
    }

    val interestingTHings = listOf("Kotlin", "Programming", "Comic Books")

    interestingTHings.forEach { it ->
        println(it)
    }

    val map = mapOf(1 to "a", 2 to "b", 3 to "c")

    map.forEach { key, value -> println("$key => $value") }

    val mutableInterestingThings = mutableListOf("Kotlin", "Programming", "Comic Books")
    mutableInterestingThings.add("Dogs")

    val mapMutable = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
    mapMutable.forEach { key, value -> println("$key => $value") }
    mapMutable.put(4, "d")

}