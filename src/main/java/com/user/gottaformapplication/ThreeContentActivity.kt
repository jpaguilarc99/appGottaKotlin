package com.user.gottaformapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ThreeContentActivity : AppCompatActivity() {

    private lateinit var btnBackThree:Button
    private lateinit var btnNextThree: Button
    private lateinit var etDateTwo: EditText
    private lateinit var etDate: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three_content)
        initComponents()
        initListeners()
    }

    private fun initComponents() {
        btnBackThree = findViewById(R.id.btnBackThree)
        btnNextThree = findViewById(R.id.btnNextThree)
        etDate = findViewById(R.id.etDate)
        etDateTwo = findViewById(R.id.etDateTwo)
    }

    private fun initListeners() {
        btnBackThree.setOnClickListener { onBackPressed() }
        etDate.setOnClickListener { showDatePickerDialog() }
        etDateTwo.setOnClickListener { showDatePickerDialog() }
        btnNextThree.setOnClickListener { navigateToThreeSec() }
    }

    private fun navigateToThreeSec() {
        val intent = Intent(this, ThreeContentSecActivity::class.java)
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