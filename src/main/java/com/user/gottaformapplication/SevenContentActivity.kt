package com.user.gottaformapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SevenContentActivity : AppCompatActivity() {

    private lateinit var btnBackSeven: Button
    private lateinit var btnNextSeven: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seven_content)
        initComponents()
        initListeners()
    }

    private fun initComponents() {
        btnBackSeven= findViewById(R.id.btnBackSeven)
        btnNextSeven = findViewById(R.id.btnNextSeven)
    }

    private fun initListeners() {
        btnBackSeven.setOnClickListener { onBackPressed() }
        btnNextSeven.setOnClickListener { navigateToEight() }
    }

    private fun navigateToEight() {
        val intent = Intent(this, EightContentActivity::class.java)
        startActivity(intent)
    }
}