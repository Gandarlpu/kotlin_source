package com.example.callback_tuturial

import android.provider.ContactsContract
import android.util.Log

// 추가 생성자로 되어잇는 친구 클래스
class MyFriendWithMoreParams() {

    private val TAG = "로그"
    
    var name : String? = null
    var age : Int? = null
    var isMarried : Boolean? = null
    var nickname : String? = null
    
    // 기본 생성자
    init {
        Log.d(TAG, "MyFriendMoreParams - init() called ")
        this.name = "길동이"
    }
    
    // 추가 생성자
    // 외부에서 호출될 때 init대신 여기로 들어옴
    constructor(name : String) : this() {
        Log.d(TAG, "MyFriendMoreParams - constructor() called ")
        this.name = name
    }

    constructor(name : String , age : Int) : this() {
        Log.d(TAG, "MyFriendMoreParams - constructor() called ")
        this.name = name
        this.age = age
    }

    constructor(name : String , age : Int , isMarried : Boolean) : this() {
        Log.d(TAG, "MyFriendMoreParams - constructor() called ")
        this.name = name
        this.age = age
        this.isMarried = isMarried
    }


}