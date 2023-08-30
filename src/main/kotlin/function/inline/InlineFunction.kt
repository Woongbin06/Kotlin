package function.inline

// 인라인 함수를 쓸 때는 람다식을 사용하는 것이 굳
// 내용이 많은 함수에 인라인 함수를 쓰면 코드가 늘어남.
inline fun shortFunc(a: Int, out: (Int) -> Unit) {
    println("Hello")
    out(a)
}

fun main() {
    // 람다에서 전달 인자가 한개면 it으로 가능
    shortFunc(3) { println("a : $it") }
}