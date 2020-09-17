val name: String = "Philip"
val name2: String = "Bobby"
var greeting: String = "hello"

var nameNull: String? = "Null Test"

fun main(){
    println(nameNull)
    nameNull = null
    println(nameNull)

    println("$greeting $name from $name2")

    val name: String = "Phil"

    var name2: String = "Tester"

    println("$greeting $name from $name2")

    name2 = "Tester 2"

    println("$greeting $name from $name2")

}