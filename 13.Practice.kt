package com.example.kolin_base.Kolin.kotlin

fun main(array:Array<String>){

    val array = arrayOf<Int>(1,2,3)

    //get, set
    val number = array.get(0)
    println(number)
/*    val number1 = array.get(100)
    println(number1)*/

    array.set(0 , 100)
    val number2 = array.get(0)
    println(number2)

    array.set(100,100)
    //Array의 Bounds는 처음 만들때 결정 된다.
    //즉 처음 선언했던 3개의 공간만 생성된다.

    //Array를 만드는 방법(3)
    val a1 = intArrayOf(1,2,3)
    //int형만 넣을 수 있는 배열
    val a2 = charArrayOf('A' , 'B' , 'C')
    //char형만 넣을 수 있는 배열


    //Array를 만드는 방법 (4)
    var a5 = Array(10 , { 0 }) // lambda식
    var a6 = Array(5 , {1;2;3;4;5})



}