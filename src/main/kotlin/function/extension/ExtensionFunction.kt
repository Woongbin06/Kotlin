package function.extension

fun main() {
    val source = "Hello World!"
    val target = "Kotlin"
    println(source.getLongString(target))
}

// 확장 함수
// 기존에 있던 클래스에 새로운 함수를 추가하는 것
fun String.getLongString(target: String): String =
        if (this.length > target.length) this else target