package com.jpaguilarc.gottaformapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TwoContentSecPartActivity : AppCompatActivity() {

    private lateinit var btnNextTwoSec: Button
    private lateinit var btnBackTwoSec: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_content_sec_part)
        initComponents()
        initListeners()
    }
    private fun initComponents() {
        btnBackTwoSec = findViewById(R.id.btnBackTwoSec)
        btnNextTwoSec = findViewById(R.id.btnNextTwoSec)
    }

    private fun initListeners() {
        btnBackTwoSec.setOnClickListener { onBackPressed() }
        btnNextTwoSec.setOnClickListener { navigateToThree() }
    }

    private fun navigateToThree() {
        val intent = Intent(this, ThreeContentActivity::class.java)
        startActivity(intent)
    }
}
