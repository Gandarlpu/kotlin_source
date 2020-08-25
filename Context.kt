package com.example.kolin_base

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Context : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_context)


        val context : Context = this
        //this라는 것은 결국 context의 자식 클래스이다.



        val applicationContext : Context = getApplicationContext() as Context




    }
}