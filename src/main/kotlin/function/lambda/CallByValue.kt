package function.lambda

fun main() {
    val result = callByValue(lambda())
    println(result) // 3
}

fun callByValue(b: Boolean): Boolean {
    println("call by value function") // 2
    return b
}

val lambda: () -> Boolean = {
    println("lambda function") // 1
    true
}