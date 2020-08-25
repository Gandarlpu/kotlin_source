package com.example.kolin_base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_fragment.*


class Fragment : AppCompatActivity() , FragmentOne.OnDataPassListener{


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        val fragmentOne = FragmentOne()
        // 프라그먼트에 데이터를 넣어주는 방법 (bundle)
        val bundle : Bundle = Bundle()
        bundle.putString("hello" , "hello")
        fragmentOne.arguments = bundle


        button.setOnClickListener{
            //프라그먼트를 동적으로 작동하는 방법
            //프라그먼트 붙이는 방법 replace / add
            val fragmentManager = supportFragmentManager

            // Transaction
            // 작업의 단위 -> 시작과 끝이 있다.
            val fragmentTransaction = fragmentManager.beginTransaction() // 실행
            fragmentTransaction.replace(R.id.container , fragmentOne) //그리기
            fragmentTransaction.commit() // 끝내기
            // 끝을 내는 방법
            // commit -> 시간 될 때 해 (좀 더 안정적)
            // commitnow -> 지금 당장해


        }

        //프레그먼트를 떼는부분
        button2.setOnClickListener {
            //프라그먼트 remove / detach하는방법
            val fragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.remove(fragmentOne) //그리기
            fragmentTransaction.commit() // 끝내기


        }

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

    override fun onDataPass(data: String?) {

        Log.d("pass" , ""+data)
        TODO("Not yet implemented")
    }
}