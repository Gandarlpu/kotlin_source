package com.example.kolin_base.Kolin.kotlin

fun main(args:Array<String>){

    val a : Int? = null
    val b : Int = 10
    val c : Int = 100


    if(a == null){
        println("a is null")
    }else{
        println("a is not null")
    }


    if(b + c == 110){
        println("c plus c equal 110")
    }else{
        println("b plus c is not 110")
    }

    //엘비스 연산
    //조건이 널인 경우 널이 아닌경우 각각 어느것을 해라를 정하는 것
    val number : Int? = null
    val number2 = number ?: 10
    //val number2에 number가 들어갈껀데 이 넘버가 널인 경우에는 10 널이 아니면 그 값이 들어감
    println()
    println(number2)



}