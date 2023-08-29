package function.defualt

/**
 * 최상위 함수는 어디에 있든 사용 가능.
 */

fun main() { // 최상위 함수
    val result1 = sum(2, 3)
    println("result1 = $result1")

    val x: Int = 5
    val y: Int = 6

    println(max(x, y))
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun max(a: Int, b:Int): Int {
    return if(a > b) a else b
}