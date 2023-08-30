package function.inline

// 부분만 noinline을 써서 인라인 함수를 안하게 할 수 있음
inline fun noinline(out1: () -> Unit, noinline out2: () -> Unit) {
    println("noinline")
    out1()
    out2()
}

fun main() {
    noinline(
        out1 = { println("hello") },
        out2 = { println("world") }
    )
}