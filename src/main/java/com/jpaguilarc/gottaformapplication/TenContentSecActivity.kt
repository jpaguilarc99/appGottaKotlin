package com.jpaguilarc.gottaformapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TenContentSecActivity : AppCompatActivity() {

    private lateinit var btnBackTenSec: Button
    private lateinit var btnNextTenSec: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ten_content_sec)
        initComponents()
        initListeners()
    }

    private fun initComponents() {
        btnBackTenSec= findViewById(R.id.btnBackTenSec)
        btnNextTenSec = findViewById(R.id.btnNextTenSec)
    }

    private fun initListeners() {
        btnBackTenSec.setOnClickListener { onBackPressed() }
        btnNextTenSec.setOnClickListener { navigateToElevenTwelve() }
    }

    private fun navigateToElevenTwelve() {
        val intent = Intent(this, ElevenTwelveContentActivity::class.java)
        startActivity(intent)
    }
}