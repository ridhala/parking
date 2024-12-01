package com.example.parking_cars

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
        val textViewlogin = findViewById<TextView>(R.id.buttonLogin)
        textViewlogin.setOnClickListener {
            val intent = Intent(this, principal::class.java)
            startActivity(intent)
        }
        val textViewSignUp = findViewById<TextView>(R.id.textViewSignUp)
        textViewSignUp.setOnClickListener {
            val intent = Intent(this, registrer::class.java)
            startActivity(intent)
        }

    }
}