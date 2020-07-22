package com.example.kolin_base.Kolin.kotlin

//08. 제어흐름
//if else


fun main(array:Array<String>){

    val a : Int = 5
    val b : Int = 10

    if(a>b){
// 1
        println("a가 b보다 크다")
    }else{
// 2
        println("a가 b보다 작다")
    }
// 3


    //값을 리턴하는 if
    val max = if(a>b){
        a
    }else{
        b
    }
    println()
    println(max)
}