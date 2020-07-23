package com.example.kolin_base.Kolin.kotlin

// 14. Collection
// list , set , map
fun main(args:Array<String>){

    //3가지 컬렉션들은 값을 바꿀 수 없다 (val)
    //Immutable Collection

    //List
    //중복을 허용한다.
    val numberList = listOf<Int>(1,2,3,3)
    println(numberList)
    println(numberList.get(0))
    println(numberList[0])

    //Set(집합)
    //중복을 허용하지 않는다.
    //순서가 없다. (인덱스가 없다.)
    val numberSet = setOf<Int>(1,2,3,3,3 , 2 , 1 , 5)
    println()
    numberList.forEach{
        println(it)
    }

    //Map
    //Key, value방식으로 관리한다.
    //키값을 주면 그 키값에 맞는 내용값을 반환한다.
    val numberMap = mapOf<String , Int>("one" to 1 , "two" to 2)
    println()
    println(numberMap.get("one"))


    //Mutable Collection
    //변경가능
    val mNumberList = mutableListOf<Int>(1,2,3)
    mNumberList.add(3, 4)
    println()
    println(mNumberList)

    val mNumberSet = mutableSetOf<Int>(1,2,3,4,4,4)
    mNumberSet.add(10)
    println(mNumberSet)


    val mNumberMap = mutableMapOf<String , Int>("one" to 1)
    mNumberMap.put("two" , 2)
    println(mNumberMap)


}