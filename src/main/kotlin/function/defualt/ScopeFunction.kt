package function.defualt

var global = 10

fun main() {
    global = 15
    println("global = $global")
    useFunc()
    println("final global = $global")
}

fun useFunc() {
    global = 20
    println("useFunc global = $global")
}