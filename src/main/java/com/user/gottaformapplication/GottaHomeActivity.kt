package com.user.gottaformapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GottaHomeActivity : AppCompatActivity() {

    private lateinit var btnFuniasForm:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gotta_home)
        initComponents()
        initListeners()
    }

    private fun initComponents() {
        btnFuniasForm = findViewById(R.id.btnFuniasForm)
    }

    private fun initListeners() {
        btnFuniasForm.setOnClickListener {
            navigateToForm()
        }
    }

    private fun navigateToForm() {
        val intent = Intent(this, ContentGottaFormActivity::class.java)
        startActivity(intent)
    }
}