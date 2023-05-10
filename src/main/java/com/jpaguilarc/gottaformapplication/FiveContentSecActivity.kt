package com.jpaguilarc.gottaformapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FiveContentSecActivity : AppCompatActivity() {

    private lateinit var btnBackFiveSec: Button
    private lateinit var btnNextFiveSec: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_five_content_sec)
        initComponents()
        initListeners()
    }

    private fun initComponents() {
        btnBackFiveSec = findViewById(R.id.btnBackFiveSec)
        btnNextFiveSec = findViewById(R.id.btnNextFiveSec)
    }

    private fun initListeners() {
        btnBackFiveSec.setOnClickListener { onBackPressed() }
        btnNextFiveSec.setOnClickListener { navigateToFiveTird() }
    }

    private fun navigateToFiveTird() {
        val intent = Intent(this, FiveContentTirdActivity::class.java)
        startActivity(intent)
    }
}