package com.example.kolin_base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_library.*

class Library : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_library)


        Glide.with(this) //컨텍스트를 넣어주면
            .load(R.drawable.example) // 1. load를 불러오고 URL로 넣는다. 2.
            .centerCrop() //기타 등등 다양한 기능 사용 가능
            .into(glide) //이미지 뷰에 넣는다. <imageview>의 아이디 = glide로 설정해놓은것


    }
}