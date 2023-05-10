package com.jpaguilarc.gottaformapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class EightContentActivity : AppCompatActivity() {

    private lateinit var btnBackEight: Button
    private lateinit var btnNextEight: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eight_content)
        initComponents()
        initListeners()
    }

    private fun initComponents() {
        btnBackEight= findViewById(R.id.btnBackEight)
        btnNextEight = findViewById(R.id.btnNextEight)
    }

    private fun initListeners() {
        btnBackEight.setOnClickListener { onBackPressed() }
        btnNextEight.setOnClickListener { navigateToEightSec() }
    }

    private fun navigateToEightSec() {
        val intent = Intent(this, EightContentSecActivity::class.java)
        startActivity(intent)
    }
}