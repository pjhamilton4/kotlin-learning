val name: String = "Philip"
var greeting: String? = null

fun main(){
    greeting = "Hello"
    val greetingToPrint = if(greeting != null) greeting else "Hi"
    println(greetingToPrint)
    println(name)

}