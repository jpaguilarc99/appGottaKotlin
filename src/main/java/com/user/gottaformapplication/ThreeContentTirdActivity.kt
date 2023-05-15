package com.user.gottaformapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThreeContentTirdActivity : AppCompatActivity() {

    private lateinit var btnBackThreeTird: Button
    private lateinit var btnNextThreeTird: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three_content_tird)
        initComponents()
        initListeners()
    }

    private fun initComponents() {
        btnBackThreeTird = findViewById(R.id.btnBackThreeTird)
        btnNextThreeTird = findViewById(R.id.btnNextThreeTird)
    }

    private fun initListeners() {
        btnBackThreeTird.setOnClickListener { onBackPressed() }
        btnNextThreeTird.setOnClickListener { navigateToFour() }
    }

    private fun navigateToFour() {
        val intent = Intent(this, FourContentActivity::class.java)
        startActivity(intent)
    }
}