package com.example.kolin_base

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_intent2.*

class Intent2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent2)


        

        result.setOnClickListener {

            val number1 = intent.getIntExtra("number1" , 0)
            val number2 = intent.getIntExtra("number2" , 0)
            //값을 찾을때 값이 없으면 바로 앱이 뻑나기 때문에 디폴트 값을 준다 아무거나
            
            val result = number1 + number2
            
            val resultIntent = Intent()
            
            resultIntent.putExtra("result" , result)
            
            setResult(Activity.RESULT_OK , resultIntent) // -1      
            //받은 값들의 결과값들을 잘 받앗고 계산하였다
            //이것들을 이제 intent에 다시 넣어주겠다
            finish() // Activity종료

        }

    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        if(requestCode == 200) {

            Log.d("number", "" + requestCode)
            val result = data?.getIntExtra("result" , 0)


        }
        super.onActivityResult(requestCode, resultCode, data)

    }
}