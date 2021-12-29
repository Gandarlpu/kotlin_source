package com.example.callback_tuturial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){

    // 상수 처리
    companion object{
        private const val TAG = "로그"
    }

    // 데이터 배열 선언
    private var pageItemList = ArrayList<PageItem>()
    private lateinit var myIntroPagerRecyclerAdapter: MyIntroPagerRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate: called")

        previous_btn.setOnClickListener {
            my_intro_view_pager.currentItem = my_intro_view_pager.currentItem - 1
        }

        next_btn.setOnClickListener {
            my_intro_view_pager.currentItem = my_intro_view_pager.currentItem + 1
        }

        // 데이터 배열을 준비
        pageItemList.add(PageItem(R.color.colorOrange , R.drawable.ic_pager_item_1 , "안녕하세요\n 개발중입니다."))
        pageItemList.add(PageItem(R.color.colorBlue , R.drawable.ic_pager_item_2 , "구독, 좋아요 눌러주세요!"))
        pageItemList.add(PageItem(R.color.colorWhite , R.drawable.ic_pager_item_3 , "알람설정 부탁드립니다."))


        // 어답터 인스턴스 생성
        myIntroPagerRecyclerAdapter = MyIntroPagerRecyclerAdapter(pageItemList)

        // apply = id를 중복으로 써주지 않아도 됨.
        my_intro_view_pager.apply {
            adapter = myIntroPagerRecyclerAdapter
            orientation = ViewPager2.ORIENTATION_HORIZONTAL
            dots_indicator.setViewPager2(this)
        }
//        my_intro_view_pager.adapter = myIntroPagerRecyclerAdapter
//        my_intro_view_pager.orientation = ViewPager2.ORIENTATION_HORIZONTAL



    }


}
