package com.greenteam.voller2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.widget.Toolbar

class reg_org : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg_org)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar!!.title = ""
        supportActionBar!!.setDisplayHomeAsUpEnabled(true);
        supportActionBar!!.setDisplayShowHomeEnabled(true);
        toolbar.setNavigationOnClickListener { onBackPressed() }
        val textView: TextView = findViewById(R.id.toolbar_title)
        textView.text = "Регистрация"
    }

    fun regnco(view: View){
        val intent = Intent(this, reg_nco::class.java)
        startActivity(intent)
    }
}