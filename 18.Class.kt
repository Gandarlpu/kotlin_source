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


