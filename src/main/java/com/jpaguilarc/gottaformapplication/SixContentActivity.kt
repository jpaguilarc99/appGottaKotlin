package com.jpaguilarc.gottaformapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SixContentActivity : AppCompatActivity() {

    private lateinit var btnBackSix: Button
    private lateinit var btnNextSix: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_six_content)
        initComponents()
        initListeners()
    }

    private fun initComponents() {
        btnBackSix= findViewById(R.id.btnBackSix)
        btnNextSix = findViewById(R.id.btnNextSix)
    }

    private fun initListeners() {
        btnBackSix.setOnClickListener { onBackPressed() }
        btnNextSix.setOnClickListener { navigateToSeven() }
    }

    private fun navigateToSeven() {
        val intent = Intent(this, SevenContentActivity::class.java)
        startActivity(intent)
    }
}