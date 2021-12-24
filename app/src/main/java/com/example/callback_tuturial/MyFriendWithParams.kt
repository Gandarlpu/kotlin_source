package com.example.callback_tuturial

import android.util.Log

// 매개변수를 가지는 클래스
class MyFriendWithParams(var name : String?
                        , var age : Int?
                        , var isMarried : Boolean?
                        , var nickname : String? ) {

    private val TAG = "로그"

    // 이니시 시작
    // 기본 생성자
    init {
        Log.d(TAG, "MyFirendWithParams - init() called: ")
        this.name = "할아범"
        this.age = 100
        this.isMarried = true
        this.nickname = "꼰머"

    }
    // 외부MainActivitiy에서 값이 들어왔어도 init이 호출되면서 값이 변경된다.


    // 추가 생성자
    constructor(name: String?
                , age: Int?
                , isMarried: Boolean?
                , nickname: String?
                , address : String) : this(name , age , isMarried , nickname){

//          this.address
    }

}