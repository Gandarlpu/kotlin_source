package com.example.kolin_base.Kolin.kotlin

//16. 반복문

fun main(){

    val a = mutableListOf<Int>(1,2,3,4,5,6,7,8,9)

    //반복하는 방법 (1)
    for (item in a) {
        //1~9까지 들어있는것
        if (item == 5) {
            println("item is Five")
        } else {
            println("item is not Five")
        }
        println()
    }

    //반복하는 방법 (2)
    //인덱스를 알고싶을때
    for((index , item) in a.withIndex()){
        println("index : " + index +" value : " + item)
    }
    println()

    //반복하는 방법 (3)
    a.forEach{ //람다문법
        println(it)
        
    }
    println()
    //반복하는 방법 (4)
    a.forEach{item -> //it이 아니라 item으로 바꾸기
        println(item)
    }
    println()

    //반복하는 방법 (5)
    a.forEachIndexed{ index, item ->
                     //index는 인덱스 item는 값(value)
        println("index : " + index +" value : " + item)
    }

    println()
    //반복하는 방법 (6)
    for (i in 0 until a.size){
        //index만 순회하는 반복문
        //0부터 a의 사이즈까지 0~8
        //until은 마지막을 포함하지 않는다.!!!
        println(a.get(i))

    }

    println()
    //반복하는 방법 (7)
    for (i in 0 until a.size step (2)){
        //2만큼 증가
        println(a.get(i))
    }

    println()
    //반복하는 방법 (8)
    for(i in a.size-1 downTo (0)){
        //8부터 0까지 반복
        //높은거부터 아래로
        println(a.get(i))
    }

    println()
    //반복하는 방법 (9)
    for(i in a.size-1 downTo (0) step (2)){
        println(a.get(i))
    }


    println()
    //반복하는 방법 (10)
    for (i in 0..10){
        //until과 달리 처음부터 끝까지 출력
        println(i)
    }



}