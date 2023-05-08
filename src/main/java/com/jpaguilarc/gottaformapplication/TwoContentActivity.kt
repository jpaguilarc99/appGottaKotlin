package com.jpaguilarc.gottaformapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TwoContentActivity : AppCompatActivity() {

    private lateinit var btnBackTwo: Button
    private lateinit var btnNextTwo: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_content)
        initComponents()
        initListeners()
    }

    private fun initComponents() {
        btnBackTwo = findViewById(R.id.btnBackTwo)
        btnNextTwo = findViewById(R.id.btnNextTwo)
    }

    private fun initListeners() {
        btnBackTwo.setOnClickListener { onBackPressed() }
        btnNextTwo.setOnClickListener { navigateToTwoSec() }
    }

    private fun navigateToTwoSec() {
        val intent = Intent(this, TwoContentSecPartActivity::class.java)
        startActivity(intent)
    }
}