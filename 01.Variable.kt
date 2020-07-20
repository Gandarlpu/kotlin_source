package com.example.kolin_base.Kolin

//변수
/*
    변수 선언방법
    (Variable) var 변수명
    (Value) val 변수명

    val은 값을 바꿀 수 없다
    var은 값을 바꿀 수 있다.
*/

var num = 10
var hello = "안녕"
var point = 3.4

val fix = 20

fun main(args:Array<String>){

    num=100
    hello = "Good"
    point = 10.5

    println(num)
    println(hello)
    println(point)

}