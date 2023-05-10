package com.jpaguilarc.gottaformapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FiveContentFifthActivity : AppCompatActivity() {

    private lateinit var btnBackFiveFifth: Button
    private lateinit var btnNextFiveFifth: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_five_content_fifth)
        initComponents()
        initListeners()
    }

    private fun initComponents() {
        btnBackFiveFifth = findViewById(R.id.btnBackFiveFifth)
        btnNextFiveFifth = findViewById(R.id.btnNextFiveFifth)
    }

    private fun initListeners() {
        btnBackFiveFifth.setOnClickListener { onBackPressed() }
        btnNextFiveFifth.setOnClickListener { navigateToSix() }
    }

    private fun navigateToSix() {
        val intent = Intent(this, SixContentActivity::class.java)
        startActivity(intent)
    }
}