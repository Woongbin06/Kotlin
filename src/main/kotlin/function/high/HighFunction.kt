package function.high

fun highFunc(sum: (Int, Int) -> Int, a:Int, b:Int): Int{
    return sum(a, b)
}

fun highFunc2(a:Int, b:Int, sum: (Int, Int) -> Int): Int{
    return sum(a, b)
}

fun main() {
    val result1 = highFunc({ x, y -> x + y }, 5, 2)
    val result2 = highFunc2(4, 3) { x, y -> x + y }

    println(result1)
    println(result2)
}