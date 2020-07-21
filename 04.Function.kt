package com.example.kolin_base.Kolin.kotlin

// 함수
// 어떤 input을 넣어주면 output이 나오는 것
// fun 함수명(변수명 : 타입 , 변수명 : 타입 ...) : 반환형 {
//     함수내용
//      return 반환값
// }

fun plus(first : Int , second : Int) : Int {
    val result : Int = first + second
    return result

}

fun main(array: Array<String>) {


    val result = plus(5,10)
    println(result)

    val result2 = plus(first = 10 , second = 30)
    println(result2)

    val result3 = plus(second = 100 , first = 200)
    println(result3)

}