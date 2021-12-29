package com.example.callback_tuturial

import android.graphics.Color
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.layout_intro_pager_item.view.*

class MyPagerViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
    //layout_intro_pager_item.xml

    private val itemImage : ImageView = itemView.pager_item_image
    private val itemContent : TextView = itemView.pager_item_text
    private val itemBg : LinearLayout = itemView.pager_item_bg

    // 데이터랑 xml이랑 연동
    // 데이터클래스를 이용
    fun bindWithView(pageItem : PageItem){
        itemImage.setImageResource(pageItem.imageSrc)
        itemContent.text = pageItem.content

        // 배경색이 흰색이 아닐 때 글씨를 흰색으로
        if(pageItem.bgColor != R.color.colorWhite){
            itemContent.setTextColor(Color.WHITE)
        }

        itemBg.setBackgroundResource(pageItem.bgColor)

    }


}