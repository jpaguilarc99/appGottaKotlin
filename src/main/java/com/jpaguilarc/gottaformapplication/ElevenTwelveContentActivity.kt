package com.jpaguilarc.gottaformapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import android.widget.ImageView



class ElevenTwelveContentActivity : AppCompatActivity() {

    private lateinit var igPicked: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eleven_twelve_content)
        initComponents()
        initListeners()

    }

    private fun initComponents() {
        igPicked = findViewById(R.id.igPicked)
    }

    private fun initListeners() {
        igPicked.setOnClickListener {
            uploadImage(igPicked)
        }
    }

    private fun uploadImage(image: Any) {
        val intent = Intent()
        intent.action = Intent.ACTION_GET_CONTENT
        intent.type = "image/*"
        startActivityForResult(intent, 1)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == 1){
            igPicked.setImageURI(data?.data)
        }
    }
}