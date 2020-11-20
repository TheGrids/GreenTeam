package com.greenteam.voller2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar


class MainActivity : AppCompatActivity() {

    val field_of_activity = arrayOf("Помощь детям с ограниченными возможностями здоровья", "Помощь взрослым с ограниченными возможностями здоровья", "Помощь многодетным семьям", "Экологические инициативы", "Помощь бездомным животным", "Помощь пожилым людям и ветеранам", "Организация патриотической направленности", "Охрана здоровья, поддержка здорового образа жизни", "Поисково-спасательное движение", "Культурные инициативы", "Поддержка семьи, материнство, отцовства, детства", "Защита прав и свобод человека")

    lateinit var option : Spinner
    lateinit var result : TextView
   // lateinit var test :

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //option = findViewById(R.id.sp_option) as Spinner

        //option.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, field_of_activity)



    }


    fun toastMe(view: View){

    }

    fun loginin(view: View){
        val intent = Intent(this@MainActivity, LoginActivity::class.java)
        startActivity(intent)
    }

    fun regorg(view: View){
        val intent = Intent(this@MainActivity, reg_org::class.java)
        startActivity(intent)
    }

    fun regvol(view: View){
        val intent = Intent(this@MainActivity, reg_vol::class.java)
        startActivity(intent)
    }


    //    fun test(view: View) {
    //        setContentView(R.layout.test)
    //    }
//    fun countMe(view: View){
//        val textView: TextView = findViewById(R.id.ad)
//        var count: Int = Integer.parseInt(textView.text.toString())
//        count++
//
//        textView.text = count.toString()
//    }
}