package com.example.kolin_base.Kolin.kotlin

fun main(){

    val a = mutableListOf<Int>(1,2,3)
    a.add(4)
    println(a)
    a.add(0, 100)
    println(a) //한 칸씩 밀리고 0번째에 100추가
    a.set(0, 200)
    println(a)
    //set은 해당 인덱스의 값을 바꾸는것
    //add는 한칸씩 미루고 추가

    a.removeAt(1)
    println(a)

    val b = mutableSetOf<Int>(1,2,3,4)
    b.add(2)
    println()
    println(b)
    b.remove(2) // Set은 인덱스가 없기 때문에 At이 없다.
    println(b)
    b.remove(100)
    println(b)//없는 값을 삭제하려해도 에러가 발생하지 않는다.

    val c = mutableMapOf<String , Int>("one" to 1)
    c.put("two" , 2)
    println()
    println(c)
    c.replace("two" , 3) //에러안걸림
    println(c)
    println(c.keys)
    println(c.values)



}