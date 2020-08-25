package com.example.kolin_base

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_one.*

class FragmentOne : Fragment() {

    interface OnDataPassListener{
        fun onDataPass(data : String?)
    }
    lateinit var dataPassListener : OnDataPassListener



    override fun onAttach(context : Context) {
        super.onAttach(context)

        dataPassListener = context as OnDataPassListener

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // 프래그먼트가 인터페이스를 처음으로 그릴 떄 호출된다.
        // inflater -> 뷰를 그려주는 역할
        // container -> 부모뷰
        return inflater.inflate(R.layout.fragment_one , container , false)

    }

    
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Activity의 OnCreate에서 했던 작업을 여기에서 한다.
        pass.setOnClickListener{
            dataPassListener.onDataPass("Good Bye")
        }


    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {

        val data = arguments?.getString("hello")


        Log.d("data" , data)
        super.onActivityCreated(savedInstanceState)
    }


    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }

    override fun onDetach() {
        super.onDetach()
    }
}