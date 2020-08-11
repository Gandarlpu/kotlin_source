package com.example.kolin_base.Kolin.kotlin

fun main(){

    val testAccess : TestAccess = TestAccess("아무개")

    testAccess.test()
    testAccess.name
    println(testAccess.name)

    testAccess.name="아무개2"
    println(testAccess.name)

    val reward : Reward = Reward()
    reward.rewardAmount = 2000
    //이렇게 클래스 변수에 접근해서 쉽게 값을 바꿀 수 있음
    //근데 이게 문제가됨
    //지역,전역 변수 개념으로는 해결x
    //결론 : private을 쓰면 해당 클래스 이외에 외부에서 변경할 수 없음
    //

    val runningCar : RunningCar = RunningCar()
    runningCar.runFast()
    //runningCar.run()
    //함수에도 사용가능

}

class RunningCar(){

    fun runFast(){
        run()
    }
    private fun run(){

    }


}

class Reward(){

    var rewardAmount : Int = 1000


}


class TestAccess{
    var name : String = "홍길동"

    constructor(name : String){

        this.name = name


    }
    fun test(){
        println("테스트")
    }


}