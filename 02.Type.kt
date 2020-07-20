package com.example.kolin_base.Kolin.kotlin

// 정수형 -> Long -> Int -> Short -> Byte
// 실수형 -> Double -> Float
// 문자 -> Char
// 문자열 -> String
// 논리형 -> Boolead

var number = 10
var number1 : Int = 20
var hello1 : String = "Hello"

// Variable or Value??
// 1. 변하지는 않는 값 = Val
// 2. 진짜 모르겠다. -> Val
// why? = 앞으로 어떤 변수가 어떻게 변할지 모르기 때문에 처음에 선언했던 값을 그대로 가지고가는 것이 안정적이기 때문


fun main(args:Array<String>){
    number = 20
    //number = 20.5
}