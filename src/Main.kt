val name: String = "Philip"
var greeting: String? = null

fun main(){
    greeting = "Hello, "
    when(greeting){
        null -> println("Hi")
        else -> println(greeting)
    }
    println(name)

}