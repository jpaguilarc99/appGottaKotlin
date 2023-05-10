package com.jpaguilarc.gottaformapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FiveContentTirdActivity : AppCompatActivity() {

    private lateinit var btnBackFiveTird: Button
    private lateinit var btnNextFiveTird: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_five_content_tird)
        initComponents()
        initListeners()
    }

    private fun initComponents() {
        btnBackFiveTird = findViewById(R.id.btnBackFiveTird)
        btnNextFiveTird = findViewById(R.id.btnNextFiveTird)
    }

    private fun initListeners() {
        btnBackFiveTird.setOnClickListener { onBackPressed() }
        btnNextFiveTird.setOnClickListener { navigateToFiveFourth() }
    }

    private fun navigateToFiveFourth() {
        val intent = Intent(this, FiveContentFourthActivity::class.java)
        startActivity(intent)
    }
}