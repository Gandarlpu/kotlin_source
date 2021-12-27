package com.example.callback_tuturial

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.custom_dialog.*


// Dialog는 상속받을 때 context를 받아와야함 = :Dialog(context)
// 근데 context를 어떻게 받아올까?
// 클래스에서 context를 선언해준다 = 클래스명(context : Context)
class MyCustomDialog(context : Context ,
                     MyCustomDialogInterface : MyCustomDialogInterface)
    : Dialog(context) , View.OnClickListener {



    private val TAG = "로그"


    private var myCustomDialogInterface : MyCustomDialogInterface? = null

    // 클래스에서 받아온 MyCustomDialogInterface는 변수MyCustomDialogInterface와 연결되어 있지 않는다.
    // 따라서, init을 통해 인터페이스를 변수에 연결시켜준다.
    init {
        myCustomDialogInterface = MyCustomDialogInterface
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.custom_dialog)

        Log.d(TAG, "MyCustom Dialog")
        // 배경 투명
        window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        like_btn.setOnClickListener(this)
        subscribe_btn.setOnClickListener(this)

    }

    override fun onClick(view: View?) {
        when(view){
            // 좋아요 버튼이 클릭 되었을 때
            like_btn -> {
                Log.d(TAG, "좋아요 버튼 클릭")

                // 발동시ㅣㄴ걸 감지하려면 인터페이스를 임플리먼트 해주야 한다.
                // 즉 메인에서
                this.myCustomDialogInterface?.onLikeBtnClicked()
            }
            subscribe_btn -> {
                Log.d(TAG, "구독 버튼 클릭")

                // 발동시ㅣㄴ걸 감지하려면 인터페이스를 임플리먼트 해주야 한다.
                // 즉 메인에서
                this.myCustomDialogInterface?.onSubscribeBtnClicked()
            }
        }
    }

}