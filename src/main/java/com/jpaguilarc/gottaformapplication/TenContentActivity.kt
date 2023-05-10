package com.jpaguilarc.gottaformapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TenContentActivity : AppCompatActivity() {

    private lateinit var btnBackTen: Button
    private lateinit var btnNextTen: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ten_content)
        initComponents()
        initListeners()
    }
    private fun initComponents() {
        btnBackTen= findViewById(R.id.btnBackTen)
        btnNextTen = findViewById(R.id.btnNextTen)
    }

    private fun initListeners() {
        btnBackTen.setOnClickListener { onBackPressed() }
        btnNextTen.setOnClickListener { navigateToTenSec() }
    }

    private fun navigateToTenSec() {
        val intent = Intent(this, TenContentSecActivity::class.java)
        startActivity(intent)
    }
}