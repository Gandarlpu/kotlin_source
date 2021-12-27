package com.example.callback_tuturial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import android.widget.Toast
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity(), MyCustomDialogInterface {

    val TAG = "로그"

    // 뷰가 생성되었을 때
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 그릴 xml 뷰 파일을 연결 시켜준다. 즉, 설정한다.
        setContentView(R.layout.activity_main)


        // myCustomDialog의 구독과 좋아요 버튼을 눌렀을 때 처리를 메인에서 받아와서 해줘야 한다.
        // 따라서, Interface로 만들어서 처리한다.


    }


    // XML에서 onclick로 하면 따로 onClickListener로 코드 추가를 시켜줄 필요가 없음
    fun onDialogBtnClicked(view : View){

        // MyCustomDialoginterface가 클래스에서 들어왔기 때문에
        // AppCompatActivity = this 와 Interface = this 2개를 넘겨줘야 한다.
        val myCustomDialog = MyCustomDialog(this , this)

        myCustomDialog.show()

    }

    // 구독버튼 클릭
    override fun onSubscribeBtnClicked() {
        Log.d(TAG, "onSubscribeBtnClicked: called")
        Toast.makeText(this , "구독버튼 클릭" , Toast.LENGTH_SHORT).show()
    }

    // 좋아요 버튼 클릭
    override fun onLikeBtnClicked() {
        Log.d(TAG, "onSubscribeBtnClicked: called")
        Toast.makeText(this , "좋아요버튼 클릭" , Toast.LENGTH_SHORT).show()
    }

}
