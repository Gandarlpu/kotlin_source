package com.example.kolin_base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() { //MainActivity는 앱컴팻액티비티를 상속받았다

    override fun onCreate(savedInstanceState: Bundle?) { // savedInstanceState의 Bundle타입으로 받는다.
        super.onCreate(savedInstanceState) //super = 애범팻액티비티의 온크레이티브 함수에 세이브인턴스스테이트를 받는다.
        setContentView(R.layout.activity_main) //R.layout.activity_main 화면을 그려주는 부분
        //onCreate는 단 한번만 하면 좋을 작업들


        Log.d("life_cycle" , "onCreate")


    }

    override fun onResume() {
        super.onResume()
        Log.d("life_cycle" , "onResume")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("life_cycle" , "onDestroy")
    }

    override fun onStop() {
        super.onStop()
        Log.d("life_cycle" , "onStop")
    }

    override fun onPause() {
        super.onPause()
        Log.d("life_cycle" , "onPause")
    }

    override fun onStart() {
        super.onStart()
        Log.d("life_cycle" , "onStart")
    }
}
