package com.example.kolin_base.Kolin.kotlin

//10 제어흐름
//when

fun main(args:Array<String>){

    val value : Int = 1

    when(value){
        1 -> println("value is 1")
        2 -> println("value is 2")
        3->{
            println("value is 3")
        }
        else->{
            println("I do not know value")
        }
    }

    //if로 바꾸면
    if(value == 1){
        println("value is 1")
    }else if(value == 2){
        println("value is 2")
    }else if(value == 3){
        println("value is 3")
    }else{
        println("I do not know value")
    }


}