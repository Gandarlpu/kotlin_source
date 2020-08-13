package com.example.kolin_base.Kolin.kotlin

// 인터페이스 특징
// - 인터페이스도 구현이 있는 함수를 만들 수 있다.
// - 인터페이스에 구현이 있는 함수는 그 인터페이스를 구현하는 클래스에서 그 함수를 구현할 필요가 없다.
// - 인터페이스의 구현이 없는 함수는 그 인터페이스를 구현하는 클래스에서 그 함수를 반드시 구현해야 한다.

fun main(){

    val student : Student__ = Student__()
    student.sleep()



}

//여기에 있는 함수는 구현을 해도되고 안해도됨
//구현하면 implement안해도됨
//구현안하면 해야함
interface Person__ {
    fun eat(){
        //여기서도 구현 가능
        println("먹는다.")
    }
    fun sleep(){
        println("잔다.")
    }
    abstract fun study()
    //반드시 구현해야함

}

class Student__: Person__ {
    override fun study() {


    }

}



class Teacher__ : Person__ {
    override fun study() {

    } //Person타입이 된 것
}


