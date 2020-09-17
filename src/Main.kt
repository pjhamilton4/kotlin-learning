val name: String = "Philip"
var greeting: String? = null

fun main(){
    //greeting = "Hello, "
    if(greeting != null) {
        println("$greeting")
    }else{
        println("Hi, ")
    }
    println("$name")

}