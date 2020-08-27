package com.example.kolin_base

import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.kolin_base.Context
import com.example.kolin_base.R
import kotlinx.android.synthetic.main.activity_shared_preference.*

class SharedPreference : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preference)



        //SharedPreference
        val sharedPreference = getSharedPreferences("sp1" , MODE_PRIVATE)
        // Mode
        // - MODE_PREVATE : 생성한 application에서만 사용 가능
        // - MODE_WORLD_READABLE : 다른 어플리케이션에서 사용 가능 -> 읽을 수만 있다.
        // - MODE_WORLD_WRITEAVABLE : 다른 어플리케이션에서 사용 가능 -> 기록도 가능하다.
        // - MODE_MULTI_PROCESS : 이미 호출되어 사용중인지 체크
        // - MODE_APPEND : 기존 preference에 신규로 추가

        val editor : SharedPreferences.Editor = sharedPreference.edit()
        editor.putString("hello" , "안녕하세요")
        editor.commit()


        //sp1 -> Sgaredpreference
        //    -> (Key , Value) -> ("Hello" , "안녕하세요")
        //sp2 -> Sgaredpreference
        //    -> (Key , Value) -> ("Hello" , "안녕하세요2")
        //위는 다른 쉐어퍼런스이기 때문에 다른 값들
        //갱신시키려면 같은 쉐어퍼런스 사용


        button.setOnClickListener {
            //SharePreference에 값을 불러오는 방법
            val sharedPreference = getSharedPreferences("sp1" , MODE_PRIVATE)
            val value = sharedPreference.getString("hello" , "데이터 없음")
            Log.d("key-value" , "Value : " + value)


        }


    }
}