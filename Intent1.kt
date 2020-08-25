package com.example.kolin_base

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intent.*

class Intent1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        //엑티비티 이름 바꾸기 = 오른쪽클릭 - 리팩터 - 리네임으로 바굼


        change_activity.setOnClickListener{

            /*val intent = Intent(this@Intent1, Intent2::class.java)
            // this 와 this@Intent1의 차이
            // 똑같은 의미이지만 안붙여주면 가금 오류가 나기 때문에 붙이는걸 추천

            intent.putExtra("number" , 1)
            intent.putExtra("number2" , 2)
            //Key , Value방식 -> Key와 value를 쌍으로 만들어 저장한다.
            //이름 , 값

            //startActivity(intent)

            val intent2 = Intent(this@Intent1 , Intent2::class.java)
            //apply = intent2에 작업하는것을 묶어줌
            //어떤 작업을 했는지 apply의 블록안에 한눈에 알 수 있음
            intent2.apply { 
                this.putExtra("number1" , 1)
                this.putExtra("number2" , 1)
            }
            startActivity(intent)
            */


            //암시적 인텐트
            val intent = Intent(Intent.ACTION_VIEW , Uri.parse("http://m.naver.com"))
            startActivity(intent)

        }




    }
}