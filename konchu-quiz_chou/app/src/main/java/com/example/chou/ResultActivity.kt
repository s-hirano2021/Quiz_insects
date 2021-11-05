package com.example.chou

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val btnback:Button=findViewById(R.id.btnback)

        btnback.setOnClickListener {
            finish()
        }
    }
}