package com.user.gottaformapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FiveContentFourthActivity : AppCompatActivity() {

    private lateinit var btnBackFiveFourth: Button
    private lateinit var btnNextFiveFourth: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_five_content_fourth)
        initComponents()
        initListeners()
    }

    private fun initComponents() {
        btnBackFiveFourth = findViewById(R.id.btnBackFiveFourth)
        btnNextFiveFourth = findViewById(R.id.btnNextFiveFourth)
    }

    private fun initListeners() {
        btnBackFiveFourth.setOnClickListener { onBackPressed() }
        btnNextFiveFourth.setOnClickListener { navigateToFiveFifth() }
    }

    private fun navigateToFiveFifth() {
        val intent = Intent(this, FiveContentFifthActivity::class.java)
        startActivity(intent)
    }
}