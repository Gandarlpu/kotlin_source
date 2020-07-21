package com.example.kolin_base.Kolin.kotlin

var a = 1+2+3+4+5 // 연산의 결과값을 변수에 넣어줄 수 있다.
var b = "1"
var c = b.toInt() // 1
var d = b.toFloat() //1.0

var e = "John"
var f = "My name is $e Nice to meet you"

// Null
// 존재하지 않는다.

//var abc : Int = null  // 에러!
var abc1 : Int? = null // 자로형뒤에 ?를 붙이면 널을 가질수 있는 변수로 바뀜
var abc2 : Double? = null
var abc3 : String? = null


fun main(array: Array<String>){

    println(a)
    println(b)
    println(c)
    println(d)
    println(f)
    println(abc1)
}