package moblie.programming.m_p_chap04

/* class User (name: String, count: Int) {
    init {
        println("i am init....")
    }
}
fun main() {
    val user = User("kkang", 10)
} */ //init 키워드로 주 생성자의 본문 지정

/* class User (val name : String, count: Int){

}
class User1(){
    val name:String = ""
    var count:Int = 0
} */ // 위 아래 같은 의미

/* class User {
    constructor(name: String) {
        println("constructor(name: String) call...")
    }
    constructor(name: String, count: Int) {
        println("constructor(name: String, count: Int) call...")
    }
}
fun main() {
    val user1 = User("kkang")
    val user2 = User("kkang", 10)
} */ //보조 생성자 선언

/* open class Super {
    open var someData = 10
    open fun someFun() {
        println("i am super class function : $someData")
    }
}
class Sub: Super() {
    override var someData = 20
    override fun someFun() {
        println("i am sub class funcrion : $someData")
    }
}
fun main() {
    val obj = Sub()
    obj.someFun()
} */ // 오버라이딩 예

/* class NonDataClass(val name: String, val email: String, val age: Int)

data class DataClass(val name: String, val email: String, val age: Int)

fun main() {
    val non1 = NonDataClass("kkang", "a@a.com", 10)
    val non2 = NonDataClass("kkang", "a@a.com", 10)

    val data1 = DataClass("kkang", "a@a.com", 10)
    val data2 = DataClass("kkang", "a@a.com", 10)

    println("non data class equals : ${non1.equals(non2)}")
    println("data class equals: ${data1.equals(data2)}")
    println("non data class toString : ${non.toString()}")
    println("data class toString : ${data.toString()}")
} */ //객체의 데이터를 비교하는 equals() 함수

/* open class Super {
    open var data = 10
    open fun some() {
        println("i am super some() : $data")
    }
}
val obj = object: Super() {
    override var data = 20
    override fun some() {
        println("i am object some() : $data")
    }
}
fun main() {
    obj.data = 30 // 성공!
    obj.some()    // 성공!
}*/ //타입을 지정한 오브젝트 클래스

/* abstract class Animal {
    var name : String = ""
    abstract fun move()
}

class Tiger : Animal() {
    var age: Int = 0
    override fun move() {
        println("네 발로 이동한다.")
    }
}

class Eagle : Animal() {
    var home : String = ""
    override fun move() {
        println("날개로 날아간다.")
    }
}

fun main() {
    var tiger1 = Tiger()
    var eagle1 = Eagle()

    tiger1.move()
    eagle1.move()
}

fun main() {
    var animal : Animal

    animal = Tiger()
    animal.move()

    animal = Eagle()
    animal.move()
} */ //추상 클래스와 추상 메소드

/* abstract class Animal {
    var name : String = ""
    abstract fun move()
}

interface  iAnimal {
    abstract fun eat()
}

class iCat : iAnimal {
    override fun eat() {
        println("생선을 좋아한다.")
    }
}

class iTiger : Animal(), iAnimal {
    override  fun move() {
        println("네 발로 이동한다.")
    }
    override fun eat() {
        println("멧돼지를 잡아먹는다.")
    }
}

class Eagle : Animal() {
    var home : String = ""
    override  fun move() {
        println("날개로 날아간다.")
    }
}
fun main() {
    var cat = iCat()
    cat.eat()

    var tiger = iTiger()
    tiger.move()
    tiger.eat()
}*/ //인터페이스와 다중 상속

/* class MyMath{
    companion object{
        fun Add(a:Int, b:Int):Int{ return a + b }
        fun Sub(a:Int, b:Int):Int{ return a - b }
        fun Mul(a:Int, b:Int):Int{ return a * b }
        fun Div(a:Int, b:Int):Int{ return a / b }
    }
}

fun main() {
    println(MyMath.Add(10, 5))
    println(MyMath.Sub(10, 5))
    println(MyMath.Mul(10, 5))
    println(MyMath.Div(10, 5))

} */ //실습