package com.example.kolin_base.Kolin.kotlin

//11.제어흐름 실습
fun main(args:Array<String>){

    val value : Int? = null

    when(value){
        null->{
            println("value is null")
        }
        else->{
            println("value is not null")
        }
    }

    val value2 : Boolean? = null

    //when구문은 조건으로 갖는 값의 모든 경우에 대응하는 것이 좋다.
    when(value2){
        true->{
            println()
        }
        false->{

        }
        null->{

        }
    }

    //값을 리턴하는 when구문의 경우 반드시 값을 리턴해야 한다.
    val value3 = when(value2){
        true->1
        null->2
        false->3
    }

    //when의 다양한 조건식
    val value4 : Int = 10
    when(value4){
        is Int->{
            //is 타입을 물을 수 있는 연산자
            //value4가 Int타입이냐
            println("value4 is int")
        }
        else->{
            println("value4 is not int")
        }
    }

    //when의 다양한 조건식(2)
    val value5 : Int = 60
    when(value5){
        in 60..70->{
            //in은 안에 잇냐는 뜻
            println("value is in 60-70")
        }
        in 70..80->{
            println("value is in 70-80")
        }
        in 80..90->{
            println("value is in 80-90")
        }
    }

}