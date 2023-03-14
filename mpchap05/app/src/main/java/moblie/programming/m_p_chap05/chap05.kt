package moblie.programming.m_p_chap05

/* fun main() {
    val some: (Int) -> Unit = {println(it)}
    some(10)
}*/ // 매개변수가 1개인 람다 함수에 it 키워드 사용

/* fun hofFun(arg: (Int) -> Boolean) : () -> String{
    val result = if(arg(10)) {
        "valid"
    } else {
        "invalid"
    }
    return {"hofFun result : $result"}
}
fun main() {
    val result = hofFun ({ no -> no > 0 })
    println(result())
} */ // 고차함수: 함수를 매개변수로 전달받거나 반환하는 함수를 의미

/* fun main() {
    var data: String? = "kkang"
    println("data = $data : ${data?.length ?: -1}")
    data = null
    println("data = $data : ${data?.length ?: -1}")
} */ //엘비스 연산자 사용

fun hofFun(function: (Int, Int) -> Boolean, arg1:Int, arg2:Int) : () -> String {
    val result = if (function(arg1, arg2)) arg1
    else arg2
    return { "Result: $result" }
}

fun main() {
    println(hofFun({a, b -> a > b}, 10, 20)())
    println(hofFun({a, b -> a > b}, 20, 10)())
    println(hofFun({a, b -> a > b}, 20, 20)())
} //실습