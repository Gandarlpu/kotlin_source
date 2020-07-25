package com.example.kolin_base.Kolin.kotlin

fun main(){

    first()
    second(80)
    third(89)
    gugudan()

}

fun first(){

    val list = mutableListOf<Int>()
    val list2 = MutableList(9 , {true})

    for(i in 1..9){
        list.add(i)
    }
    println(list)

    //////////////////////////////////////////////////////////
/*    for(i in 0..list.size){
        if(list.get(i) % 2 == 0){
            //짝수
            list2.set(i , "false")
        }else{
            list2.set(i , "true")
        }
    }
    println(list2)*/

    list.forEachIndexed{index, value ->
        if(value % 2 == 0){
            //짝수
            list2[index] = true
        }else{
            list2[index] = false
        }
    }
    println(list2)

}

fun second(score : Int){

    if(score <= 90 && score >= 80){
        println("A")
    }else if(score <= 79 && score >= 70){
        println("B")
    }else if(score <= 69 && score >= 60){
        println("C")
    }else{
        println("F")
    }

}

fun third(number : Int){

    val a : Int = number / 10
    val b : Int = number % 10

    println("값 : " + (a+b))


}

fun gugudan(){
    println()
    for(i in 2..9) {
        for (j in 1..9) {
            println(i * j)
        }
        println()
    }
}