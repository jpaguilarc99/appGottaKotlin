package com.user.gottaformapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class OneContentActivity : AppCompatActivity() {

    private lateinit var btnBack: Button
    private lateinit var btnNext: Button
    private lateinit var etDate: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one_content)
        initComponents()
        initListeners()
    }

    private fun initComponents() {
        btnBack = findViewById(R.id.btnBack)
        btnNext = findViewById(R.id.btnNext)
        etDate = findViewById(R.id.etDate)
    }

    private fun initListeners() {
        btnBack.setOnClickListener { onBackPressed() }
        etDate.setOnClickListener { showDatePickerDialog() }
        btnNext.setOnClickListener { navigateToTwo() }
    }

    private fun navigateToTwo() {
        val intent = Intent(this, TwoContentActivity::class.java)
        startActivity(intent)
    }

    //Selector de Fecha
    private fun showDatePickerDialog() {
        val datePicker = DatePickerFragment { day, month, year -> onDateSelected(day, month, year) }
        datePicker.show(supportFragmentManager, "datePicker")
    }

    private fun onDateSelected(day:Int, month:Int, year:Int){
        etDate.setText("$day / $month / $year")
    }
}