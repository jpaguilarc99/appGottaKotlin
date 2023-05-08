package com.jpaguilarc.gottaformapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThreeContentSecActivity : AppCompatActivity() {

    private lateinit var btnBackThreeSec: Button
    private lateinit var btnNextThreeSec: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three_content_sec)
        initComponents()
        initListeners()
    }

    private fun initComponents() {
        btnBackThreeSec = findViewById(R.id.btnBackThreeSec)
        btnNextThreeSec = findViewById(R.id.btnNextThreeSec)
    }

    private fun initListeners() {
        btnBackThreeSec.setOnClickListener { onBackPressed() }
        btnNextThreeSec.setOnClickListener { navigateToThreeTird() }
    }

    private fun navigateToThreeTird() {
        val intent = Intent(this, ThreeContentTirdActivity::class.java)
        startActivity(intent)
    }
}