package com.user.gottaformapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class FiveContentActivity : AppCompatActivity() {

    private lateinit var btnBackFive: Button
    private lateinit var btnNextFive: Button
    private lateinit var etDate: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_five_content)
        initComponents()
        initListeners()
    }

    private fun initComponents() {
        btnBackFive = findViewById(R.id.btnBackFive)
        btnNextFive = findViewById(R.id.btnNextFive)
        etDate = findViewById(R.id.etDate)
    }

    private fun initListeners() {
        btnBackFive.setOnClickListener { onBackPressed() }
        btnNextFive.setOnClickListener { navigateToFiveSec() }
        etDate.setOnClickListener { showDatePickerDialog() }
    }

    private fun navigateToFiveSec() {
        val intent = Intent(this, FiveContentSecActivity::class.java)
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