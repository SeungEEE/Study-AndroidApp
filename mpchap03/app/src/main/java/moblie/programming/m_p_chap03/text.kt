package moblie.programming.m_p_chap03

/* fun main(){
    val str ="""
        hello
        world
    """

    println(str)
} */

/* fun main(){
    fun sum(no: Int):Int{
        var sum = 0
        for (i in 1..no){
            sum += i
        }
        return sum
    }
    val name: String = "KKang"
    println("name $name, sum: ${sum(10)}, plus: ${10 + 20}")
} */ // 문자열 템플릿: String 타입의 데이터에 변숫값이나 어떤 연산식의 결괏값을 포함할 때는 $기호를 이용

/* fun main() {
    fun some(data1: Int, data2: Int = 10): Int {
        return data1 * data2
    }
    println(some(10))
    println(some(10, 20))
    println(some(data2 = 30, data1 = 10))

}*/ // 함수의 매개변수에는 기본값 선언 가능

/* fun main() {
    val data1 = arrayOf<Int>(10,20,30)
    println(
        """
    array size: ${data1.size}
    array data: ${data1[0]}, ${data1[1]}, ${data1.get(2)}
    """
    )
} */

/* fun main() {
    var map = mapOf<String, String>(Pair("one", "hello"),"two" to "world")
    println(
        """
    map size : ${map.size}
    map data : ${map.get("one")}, ${map.get("two")}
    """
    )
} */ //Map 객체는 키와 값으로 이루어진 데이터의 집합 / Map 객체의 키와 값은 Pair 객체

/* fun main() {
    val map = mutableMapOf<String,String>("1" to "Hello","2" to "World")
    map.put("3", "test")

    println("${map["1"]}, ${map.get("2")}, ${map["3"]}")
} */

/* fun main() {
    val data = 10
    when(data) {
        10 -> println("data is 10")
        20 -> println("data is 20")
        else -> {
            println("data is not valid data")
        }
    }
} */

/* fun main() {
    val data = 10

    println("result : ${if (data>10) true else false}")
} */

/* fun main() {
    var data = 10
    val result = when {
        data <= 0 -> "data is <= 0"
        data > 100 -> "data is > 100"
        else -> "data is valid"
    }
    println(result)
} */

/* fun main() {
    var data = arrayOf<Int>(10, 20, 30)
    for (i in data.indices){
        print(data[i])
        if (i !== data.size - 1) print(",")
    }

} */

/* fun main() {
    val data = arrayOf(10, 20, 30)
    for (i in data) {
        println(i)
    }
    for (i in data.indices) {
        println(data[i])
    }

    for ((i, value) in data.withIndex()) {
        println("$i, $value")

    }
}*/

fun main(args: Array<String>){
    var sum = 0
    for(i in 1..11 step 2){
        sum += i
        println("1부터 ${i}까지 홀수 값만을 더한 값은 ${sum}이다.")
    }
}
