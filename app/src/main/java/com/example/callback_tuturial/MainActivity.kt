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



    }

}