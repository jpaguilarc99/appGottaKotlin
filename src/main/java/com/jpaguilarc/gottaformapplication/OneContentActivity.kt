package com.jpaguilarc.gottaformapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OneContentActivity : AppCompatActivity() {

    private lateinit var btnBack: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one_content)
        initComponents()
        initListeners()
    }

    private fun initComponents() {
        btnBack = findViewById(R.id.btnBack)
    }

    private fun initListeners() {
        btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}