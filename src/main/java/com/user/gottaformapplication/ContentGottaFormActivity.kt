package com.user.gottaformapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ContentGottaFormActivity : AppCompatActivity() {

    private lateinit var btnStartFillingForm: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content_gotta_form)
        initComponents()
        initListeners()
    }

    private fun initComponents() {
        btnStartFillingForm = findViewById(R.id.btnStartFillingForm)
    }

    private fun initListeners() {
        btnStartFillingForm.setOnClickListener { navigateToOne() }
    }

    private fun navigateToOne() {
        val intent = Intent(this, OneContentActivity::class.java)
        startActivity(intent)
    }
}