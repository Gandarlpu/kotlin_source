package com.example.kolin_base.Kolin.kotlin


//상속
//부모로부터 설명서를 물려받는다

//두번까지는 봐준다
//두번 이상은 리펙토링 해라

fun main(array: Array<String>){

    val superCar100 = SuperCar100()
    superCar100.drive()
    superCar100.stop()

    val bus100 = Bus100()

}


//부모 : Car100
//자식 : SueperCar100, Bus100
open class Car100(){
    //똑같은 기능을 여러개 만들면 만들순 있지만 불편함
    open fun drive(){
        println("달린다.")
    }
    fun stop(){

    }
}

class SuperCar100() : Car100(){
    //마우스우클릭 -> 제너레이트 -> 오버라이드
    //or 직접 입력
    //오바라이드란 덮어쓴 함수라는 뜻
    //부모의 함수를 덮어썻다.
    override fun drive() {

        //super란 무엇인가
        //부모의 드라이브를 호출한다.
        //super.drive()
        println("빨리 달린다.")
    }
}

class Bus100(){

}
