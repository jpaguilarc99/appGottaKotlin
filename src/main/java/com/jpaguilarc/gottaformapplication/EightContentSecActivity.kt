package com.jpaguilarc.gottaformapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class EightContentSecActivity : AppCompatActivity() {

    private lateinit var btnBackEightSec: Button
    private lateinit var btnNextEightSec: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eight_content_sec)
        initComponents()
        initListeners()
    }

    private fun initComponents() {
        btnBackEightSec= findViewById(R.id.btnBackEightSec)
        btnNextEightSec = findViewById(R.id.btnNextEightSec)
    }

    private fun initListeners() {
        btnBackEightSec.setOnClickListener { onBackPressed() }
        btnNextEightSec.setOnClickListener { navigateToNine() }
    }

    private fun navigateToNine() {
        val intent = Intent(this, NineContentActivity::class.java)
        startActivity(intent)
    }
}