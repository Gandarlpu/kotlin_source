package com.example.kolin_base.Kolin.kotlin

// 12.배열

// 배열이 필요한 이유
// - 집합이 필요할 때

fun main(array:Array<String>){

    //배열 생성방법 (1)
    var number : Int = 10 //선언
    val group1 = arrayOf<Int>(1,2,3,4,5)//생성
    //선언과 생성은 다르지않다.

    println(group1 is Array)

    //배열 생성방법 (2)
    var numver1 = 10
    var group2 = arrayOf(1,2,3.5 , "Hello")
    //arrayOf는 아무런 타입을 넣을 수 있다.

    //Index란
    //배열의 순서 - 0부터 시작

    //배열의 값을 꺼내는 방법
    val test = group1.get(4)
    println(test)


    //배열의 값을 꺼내는 방법 (2)
    val test2 = group1[0]
    println(test2)

    //배열의 값을 바꾸는 방법 (1)
    group1.set(0 , 100)  //0번째 값을 100으로 바꿈.
    println(group1[0])

    //배열의 값을 바꾸는 방법 (2)
    group1[0] = 200
    println(group1[0])





}