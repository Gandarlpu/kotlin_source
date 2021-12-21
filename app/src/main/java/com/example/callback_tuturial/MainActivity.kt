package com.example.callback_tuturial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log

class MainActivity : AppCompatActivity() {

    val TAG = "로그"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG , "MainActivity-onCreate() called")

        someCallBackMethod(completion = {
            Log.d(TAG , "MainActivitiy - 컴플레이션 블럭 호출됨 / it : $it")
        })

    }

    private fun someCallBackMethod(completion : (String) -> Unit) {
        Log.d(TAG , "MainActivity - someCallbackMethod() called")

        Handler().postDelayed({

            completion("하하하 끝났다.")

        } , 1000L)

    }


}