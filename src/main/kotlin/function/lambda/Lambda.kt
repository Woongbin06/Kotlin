package function.lambda

fun main() {

    // 일반 변수에 람다식 할당
    val multi1 = { a: Int, b: Int -> a * b}
    val multi2: (a:Int, b:Int) -> Int = { a, b ->
        println("a * b = ${a * b}" )
        a * b
    }

    // 람다가 두개지요
    val nestedLambda: () -> () -> Unit = { { println("이중 람다") } }


    val result = multi1(10, 20)
    println(result)
    val result2 = multi2(10, 20)
    println(result2)
}