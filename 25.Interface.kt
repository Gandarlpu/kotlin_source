package com.example.kolin_base.Kolin.kotlin

//27 Interface
// - 인터페이스는 약속 -> 니가 이것을 구현하면 너도 이 타입이다
// - 생성자가 없다 () -> 인스턴스화 시킬 수 없다 -> 설명서가 아니다
// - 지침서가 아니다 -> 이것을 구현하고 싶다면 반드시 아래 기능을 구현해라.

// 상속 & 인터페이스
// 상속 -> 자식클래스들이 공통으로 혹은 조금 다른 함수들을 부모 클래스에 올려놓으면 편함
// 인터페이스 -> 구현하는 클래스의 함수가 많이 다를 때, 협업할 때 매우 유용

//Person이라는 구현하는 클래스는 인터페이스가 가지고있는 기능을 구현해줘야한다
//구현이란 상세한 기능설명을 해주는 것을 말한다.

//인터페이스의 장점
//같이 모여서 인터페이스를 정의함
//사람인터페이스는 먹고 자는 함수가 있다고 약속
//다른사람은 스튜던트 클래스를 만듦
//다른사람이 만든것을 갖다 쓸 수 있음

fun main(){

    val student_ : Student_ = Student_()
    student_.eat()
    student_.sleep()



}

interface Person_ {
    fun eat()
    fun sleep()
}

class Student_ : Person_ {

    override fun eat() {

    }

    override fun sleep() {

    }
}

class SoccerPlay : Person_ { //Person타입이 된 것
    override fun eat() {
        TODO("Not yet implemented")
    }

    override fun sleep() {
        TODO("Not yet implemented")
    }
}







open class Person(){
    open fun eat(){

    }
    fun sleep(){

    }
}

class Student() : Person(){
    override fun eat() {

        super.eat()
    }


}

class Teacher() : Person(){



}