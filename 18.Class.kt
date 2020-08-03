package com.example.kolin_base.Kolin.kotlin

//18. Class
//OOP -> Object Oriented Programing (객체 지향 프로그래밍)

// "객체"란 무엇인가?
// 이름이 있는 모든 것

// 절차지향 프로그래밍
// 코드를 위에서부터 아래로 실행한다.

// 객체지향 프로그래밍
// 객체를 만들어서 객체에게 일을 시켜서 실행한다.
// 축구게임을 만들려면 선수, 경기장, 심판, 관중 -> 축구게임
// 선수객체 , 경기장 객체, 심판객체, 관중객체를 만든다.

// 객체를 만드는 방법
// 설명서가 있어야 한다.
fun main(){

    // 클래스(설명서)를 통해서 실체를 만드는 방법
    // 인스턴스화 -> 인스턴스(객체) -> 어떤 설명서를 통해서 실제로 만드는 것
    Car("v8 engine" , "big")

    val bigCar : Car = Car("v8 engine" , "big")
    //우리가 만든 클래스(설명서)는 자료형이 된다.
    //(1)의 자료형을 호출

    val SuperCar : SuperCar = SuperCar("good engine" , "big" , "white")
    //(2)의 생성자를 호출

    //인스턴스가 가지고있는 기능을 사용하는 방법
    //RunableCar.ride() -> 불가능
    val runnableCar : RunableCar = RunableCar("simple engine" , "body")
    runnableCar.ride()
    runnableCar.drive()
    runnableCar.navi("부산")


    //인스턴스의 멤버변수에 접근하는 방법
    var runnableCar2 : RunnableCar2 = RunnableCar2("nice engine" , "long body")
    println(runnableCar2.body)
    println(runnableCar2.engine)


    println()
    val test : TestClass = TestClass()
    test.test(1)
    test.test(1,2)

}

//클래스 만드는 방법(1)
//class는 설명서(재료)
class Car(var engine : String , var body : String){
    //함수는 그냥 매개변수를 받아서 사용할 수 있지만
    //함수는 클래스에서 따로 변수설정 후 받아야 한다.
    var a1 = engine
    var a2 = body

}

//클래스 만드는 방법(2)
class SuperCar {
    var engine : String
    var body : String
    var door : String

    constructor(engine : String , body : String , door : String){

        this.engine = engine
        this.body = body
        this.door = door
        //여기서 실행되서 this로 현재 클래스에 있는 변수에 담는다.

    }

}

//클래스 만드는 방법(3)
//부품이 있어도되고 없어도 될 때
class Car1(engine : String , body : String) {
    var door : String = "" // 꼭 필요한 부품은 매개변수로받고
    //잇어도되고 없어도 되는건 밑에서 새로생성

    constructor(engine: String , body: String , door: String) : this(engine , body) {
        this.door = door //그리고 생성자 만든 후 this에서 2개를 넣고 door도 추가
    }
}

//클래스 만드는 방법(4) -> 2번 방법의 확장
class Car2{

    var engine : String = ""
    var body : String = ""
    var door : String = ""

    constructor(engine: String , body: String){
        this.engine = engine
        this.body = body


    }

    constructor(engine: String , body: String , door: String){
        this.engine = engine
        this.body = body
        this.door = door
    }

}

//클래스 만드는 방법 (5)
class RunableCar(engine : String , body : String){

    fun ride(){

        println("탑승 하였습니다.")

    }

    fun drive(){

        println("달립니다.")

    }

    fun navi(destination : String){

        println("$destination 으로 목적지가 설정되었습니다.")

    }

}

class RunnableCar2{

    var engine : String
    var body : String

    constructor(engine: String , body: String){

        this.engine = engine
        this.body = body

    }

    //RunnableCar2를 통해서 인스턴스화 될때 init부분이 가장먼저 호출되서
    //초기 셋팅을 시킬 때 유용하다.
    init {
      println("RunnaleCar2가 만들어졌습니다.")
    }

    fun ride(){

        println("탑승 하였습니다.")

    }

    fun drive(){

        println("달립니다.")

    }

    fun navi(destination : String){

        println("$destination 으로 목적지가 설정되었습니다.")

    }
}

//오버로딩
//함수 이름이 동일할 때 처리
//이름이 똑같아도 매개변수(파라미터)가 다르면 다르게 처리한다.
class TestClass(){

    val a : Int = 10
    val b : Int = 20

    fun test(a : Int){
        println("up")

    }

    fun test(a : Int , b : Int){
        println("down")
    }

}