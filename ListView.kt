package com.example.kolin_base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_list_view.*
import java.util.ArrayList

class ListView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)


        val carList = ArrayList<CarForList>()
        for (i in 0 until 10){
            carList.add(CarForList("" + i + "번째 자동차" , "" + i + "순위 엔진"))
        }

        val adapter = ListViewAdapter(carList , LayoutInflater.from(this@ListView))
        listView.adapter = adapter

        //클릭리스너
        listView.setOnItemClickListener { parent, view, position, id ->
            val carName = (adapter.getItem(position) as CarForList).name// 해당번째 항목이 넘어옴
            val carEngine = (adapter.getItem(position) as CarForList).engine

            Toast.makeText(this , carName + " " + carEngine , Toast.LENGTH_SHORT).show()

        }
    }
}

class ViewHolder{
    var carName : TextView? = null
    var carEngine : TextView? = null
}

class ListViewAdapter(
    val carForList: ArrayList<CarForList>,
    val layoutInflater : LayoutInflater
) : BaseAdapter(){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        //1,2,3,4,번쨰 항목의 아이디를 부여해줘야함
        // 그리고자 하는 아이템 리스트의 하나(포지션에 해당하는)

        //1. 뷰 받아오기
        /*val view = layoutInflater.inflate(R.layout.item_view , null)
        var carNameTextView = view.findViewById<TextView>(R.id.car_name) //여기는 200번씩 반복되서 메모리낭비
        var carEngineTextView = view.findViewById<TextView>(R.id.car_engine)

        return view */

        //2. 뷰홀더 사용
        val view : View
        val holder : ViewHolder

        if(convertView == null){ //convertView는 재활용되는 뷰
            view = layoutInflater.inflate(R.layout.item_view , null)
            holder = ViewHolder()

            holder.carName = view.findViewById(R.id.car_name) 
            holder.carEngine = view.findViewById(R.id.car_engine)
            // 맨 처음에 리스트뷰에 아무것도 없을 떄 즉, 재활용 되는 뷰가 업을 때는
            // findView로 뷰를 찾아와서 그려줌.

            view.tag = holder
        }else{
            holder = convertView.tag as ViewHolder
            view = convertView
            //그 다음 화면을 올려서 없어진 뷰를 밑으로 붙여서 재활용해주는데 여기서
            //없어진 뷰를 홀더에 담아서 재활용해서 메모리 낭비를 줄임
        }
        holder.carName?.setText(carForList.get(position).name)
        holder.carEngine?.setText( carForList.get(position).engine)

        return view
    }

    override fun getCount(): Int { //총 몇개를 그릴건지 갯수를 알려줌
        return carForList.size //리스트에 담겨잇는 갯수를 반환
    }

    override fun getItem(position: Int): Any { //순서
        return carForList.get(position)
    }

    override fun getItemId(position: Int): Long {
        //해당 포지션에 위치해 있는 아이템 뷰의 아이디 설정
        return position.toLong()

    }
}
