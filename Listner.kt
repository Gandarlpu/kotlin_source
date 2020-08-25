package com.example.kolin_base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_listner.*

class Listner : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listner)


        //아이디 불러오는 방법 1
        val textView : TextView = findViewById(R.id.hello)

        //2번쨰
        //OnClick = 클릭시
        //Listener = 듣고있다
        //set장착
        //사용자가 클릭을 하면 이 뷰에 달려잇는 리스너들을 찾고 전부다 알려줌
        //그래서 it으로 들어옴
        //it : View = hello
        //1. 람다함수
        hello.setOnClickListener {
            Log.d("click" , "Click!!")

        }

        //2. 익명함수
        hello.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                Log.d("click" , "Click!!")
            }
        })

        //3. 따로 이름없음
        val click = object : View.OnClickListener{
            override fun onClick(v: View?) {
                Log.d("click" , "Click!!")
            }
        }
        hello.setOnClickListener(click)

/*      3번,2번은 인터페이스로 onclick시 뷰를 받도록 되어있음
        public interface OnClickListener {
            *//**
             * Called when a view has been clicked.
             *
             * @param v The view that was clicked.
             *//*
            void onClick(View v);
        }*/



        //뷰를 조작하는 함수들
        //1.setText
        hello.setText("안녕하세요.")
        //resid = 리소스아이디 = value -> string.xml

        //2. setImage
        image.setImageResource(R.drawable.ic_launcher_background)

    }
}