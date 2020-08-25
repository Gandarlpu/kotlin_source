package com.example.kolin_base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.kolin_base.Kolin.kotlin.number1

class NullSatefy : AppCompatActivity() {


    lateinit var lateCar : Car

    class Car(var number : Int){

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_null_satefy)

        lateCar = Car(10)
        Log.d("number" , "late init: " + lateCar.number)
//      lateCar = Car(10) 이걸 나중에 초기화해도 마지막에는 초기화를 해놔야한다.

        var number : Int = 10
        val number1 : Int? = null

        val number5 : Int = number1!! + 10

        //val number3 = number? + number1 => X
        val number3 = number1?.plus(number)
        
        Log.d("number" , "number3 : " + number3)
        
        //삼항연산자 -> 엘비스 연산자 (?:)
        val number4 = number1 ?:10 //number1이 널이면 number4에 들어가고 아니면 10이 들어가라
        Log.d("number" , "number3 : " + number3)



    }
    
    fun plus(a : Int , b : Int?) : Int {
        if(b != null) return a + b
        else return a
        
        
    }
    
    fun plus2(a : Int , b : Int?) : Int? { //리턴타입에도 붙일수잇다.
        return b?.plus(a)
    } 
    
}