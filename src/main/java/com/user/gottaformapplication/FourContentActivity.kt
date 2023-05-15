package com.user.gottaformapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FourContentActivity : AppCompatActivity() {

    private lateinit var btnBackFour: Button
    private lateinit var btnNextFour: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four_content)
        initComponents()
        initListeners()
    }

    private fun initComponents() {
        btnBackFour = findViewById(R.id.btnBackFour)
        btnNextFour = findViewById(R.id.btnNextFour)
    }

    private fun initListeners() {
        btnBackFour.setOnClickListener { onBackPressed() }
        btnNextFour.setOnClickListener { navigateToFive() }
    }

    private fun navigateToFive() {
        val intent = Intent(this, FiveContentActivity::class.java)
        startActivity(intent)
    }
}