package function.lambda

fun main() {
    val result = callByName(otherLambda)
    println(result)
}

// 매걔변수로 람다를 사용하면 람다의 결과가 아닌 내용 자체가 들어감
fun callByName(b: () -> Boolean): Boolean {
    println("call by name function")
    return b()
}

val otherLambda: () -> Boolean = {
    println("otherLambda function")
    true
}