package com.example.kolin_base

import android.app.Person
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import com.example.kolin_base.Kolin.kotlin.number
import kotlinx.android.synthetic.main.activity_phonebook.*
import kotlinx.android.synthetic.main.phone_item.*
import java.nio.file.Files.size

class phonebook : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phonebook)


        val phoneList = ArrayList<phonebooks>()
        //준비
        for(i in 0 until 10){
            phoneList.add(phonebooks("$i 번째" , ""+i+i+i + " - " + i+i+i+i + " - " + i+i+i+i))
        }

        val containter2 = findViewById<LinearLayout>(R.id.phone_area) //어디다가 붙일까
        val inflater = LayoutInflater.from(this@phonebook) //여기에 있는 값들을 붙여라


        fun addSetOnClickListener(person: person , view : View){
            view.setOnClickListener{
                val intent = Intent(this@phonebook , phone_detail::class.java)
                intent.putExtra("name" , person.name)
                intent.putExtra("number" , person.number)
                startActivity(intent)
            }
        }

        //붙여넣기
        for(i in 0 until phoneList.size){
            val itemView2 = inflater.inflate(R.layout.phone_item , null)
            val NameView = itemView2.findViewById<TextView>(R.id.phone_name)
            val numberView = itemView2.findViewById<TextView>(R.id.phone_number)

            NameView.setText(phoneList.get(i).name)
            numberView.setText(phoneList.get(i).number)
            containter2.addView(itemView2)

        }

    }
}


class phonebooks(val name : String , val number : String){

    val personList = ArrayList<Person>()

    fun addPerson(person : person){

    }
}

class person(val name : String , val number : String){

}