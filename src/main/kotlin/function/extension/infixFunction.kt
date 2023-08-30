package function.extension

fun main() {
    val num = 3

    // 일반 표현법
    val str = num.strPlus("Kotlin")
    println(str)

    // 중위 표현법
    val str1 = num strPlus "Kotlin"
    println(str1)
}

infix fun Int.strPlus(x: String) : String {
    return "$x version $this"
}