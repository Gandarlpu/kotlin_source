package com.example.callback_tuturial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {

    val TAG = "로그"

    // 뷰가 생성되었을 때
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 그릴 xml 뷰 파일을 연결 시켜준다. 즉, 설정한다.
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate: called")

        // myfriend설계도 생성
        var myfriend = MyFriend()

        // 매개변수가 들어가는 생성자
        var myFriendChulsoo = MyFriendWithParams(name = "철수"
            , age = 17
            , isMarried = false
            , nickname = "안철수"
            , address = "대한민국")

        // 매개변수가 일정하게 들억자ㅣ않으면 에러가 뜬다.
        // 추가 생성자로 처리를 해놔야 에러가 뜨지 않는다.
        var myFriendSoosan = MyFriendWithParams(name = "철수"
            , age = 17
            , isMarried = false
            , nickname = "ㅎㅇ")


        // 추가 생성자로 되어있는 친구 객체
        var myFriendJames_1 = MyFriendWithMoreParams()
        Log.d(TAG, "onCreate: MyFreidJames.name : ${myFriendJames_1.name}")

        var myFriendJames_2 = MyFriendWithMoreParams(name = "제임스")
        Log.d(TAG, "onCreate: MyFreidJames.name : ${myFriendJames_2.name} ")
        Log.d(TAG, "onCreate: MyFreidJames.name : ${myFriendJames_2.age} ")

        var myFriendJames_3 = MyFriendWithMoreParams(name = "제임스" , age = 50 , isMarried = true , nickname = "본드")
        Log.d(TAG, "onCreate: MyFreidJames.name : ${myFriendJames_3.name}")
        Log.d(TAG, "onCreate: MyFreidJames.name : ${myFriendJames_3.age}")
        Log.d(TAG, "onCreate: MyFreidJames.name : ${myFriendJames_3.isMarried}")


    }

}
