package com.example.kolin_base.Kolin.kotlin

var number10 : Int = 10

//변수의 접근 범위
// 1. 전역 변수
// 2. 지역 변수


fun main(){

    println(number10)

    val test = Test("")
    test.testFun()
    test.name
    println(number10)

}


class Test(var name : String){

    fun testFun(){
        name = "홍길동"
        number10 = 100


    }

}