package com.example.kolin_base

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import androidx.core.widget.addTextChangedListener
import kotlinx.android.synthetic.main.activity_open_internet.*

class OpenInternet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_open_internet)


        address_edit_text

        open.setOnClickListener {

            val address = address_edit_text.text.toString()
            val intent = Intent(Intent.ACTION_VIEW , Uri.parse(address))
            startActivity(intent)

        }

        //에딧텍스트에 무엇이 쓰이는지 감지하는 함수
        //익명함수는 object를 열어주고 필요한 데이터를 써줌
        //또한 익명함수는 소괄호안에 대괄호를 열어줘야한다.
        address_edit_text.addTextChangedListener(object:TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                Log.d("edit" , "beforeTextChanged  : " + s)
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                Log.d("edit" , "onTextChanged  : " + s)
            }

            override fun afterTextChanged(s: Editable?) {
                if(s.toString() == "abc") {
                    Log.d("edit" , "text is abc")
                }

                Log.d("edit" , "afterTextChanged  : " + s)
            }
        })


    }
}