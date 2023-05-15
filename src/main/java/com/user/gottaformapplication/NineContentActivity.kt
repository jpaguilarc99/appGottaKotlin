package com.user.gottaformapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NineContentActivity : AppCompatActivity() {

    private lateinit var btnBackNine: Button
    private lateinit var btnNextNine: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nine_content)
        initComponents()
        initListeners()
    }

    private fun initComponents() {
        btnBackNine= findViewById(R.id.btnBackNine)
        btnNextNine = findViewById(R.id.btnNextNine)
    }

    private fun initListeners() {
        btnBackNine.setOnClickListener { onBackPressed() }
        btnNextNine.setOnClickListener { navigateToTen() }
    }

    private fun navigateToTen() {
        val intent = Intent(this, TenContentActivity::class.java)
        startActivity(intent)
    }
}