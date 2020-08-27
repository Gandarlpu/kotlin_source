package com.example.kolin_base

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock.sleep
import android.util.Log
import android.widget.ProgressBar
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_async.*
import java.lang.Exception
class Async : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_async)

        var task : BackgroundAsyncTask? = null
        start.setOnClickListener {
            task = BackgroundAsyncTask(prograabar , ment)
            task?.execute()
        }
        stop.setOnClickListener {
            task?.cancel(true)
        }


    }
}


class BackgroundAsyncTask(
    val progressbar : ProgressBar,
    val progressText : TextView
) : AsyncTask<Int , Int , Int>(){
    // params -> doInBackground에서 사용할 타입
    // Progress -> onProgressUpdate에서 사용할 타입
    // result -> onPostExcute에서 사용할 타입

    var percent : Int = 0

    override fun onPreExecute() {
        percent = 0 //작업이 실행될 때는 0부터 실행되어야 하니까 0으로 초기화
        progressbar.setProgress(percent)
    }

    override fun doInBackground(vararg params: Int?): Int {
        //첫번째 타입은 여기에 쓰인다 (params)

        while(isCancelled() == false){
            //isCanelled는 완료가 됫는지 안됫는지 알려줌
            percent ++
            if(percent>100){
                break
            }else{
                publishProgress(percent) // 여기서 온 프로그래스 엡데이트로 퍼센트의 값을 가지고감
            }

            try{
                Thread.sleep(1000)
            }catch (e : Exception){
                e.printStackTrace()
            }
        }
        return percent
    }

    override fun onProgressUpdate(vararg values: Int?) {
        progressbar.setProgress(values[0] ?: 0)
        progressText.setText("퍼센트 : " + values[0])
        super.onProgressUpdate(*values)
    }

    override fun onPostExecute(result: Int?) {
        progressText.setText("작업이 완료되었습니다.")
    }

    override fun onCancelled() {
        progressbar.setProgress(0)
        progressText.setText("작업이 취소되었습니다.")
    }
}