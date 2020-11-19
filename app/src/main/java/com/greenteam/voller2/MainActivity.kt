package com.greenteam.voller2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    val field_of_activity = arrayOf("Помощь детям с ограниченными возможностями здоровья","Помощь взрослым с ограниченными возможностями здоровья","Помощь многодетным семьям","Экологические инициативы","Помощь бездомным животным","Помощь пожилым людям и ветеранам", "Организация патриотической направленности","Охрана здоровья, поддержка здорового образа жизни","Поисково-спасательное движение","Культурные инициативы","Поддержка семьи, материнство, отцовства, детства","Защита прав и свобод человека")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}