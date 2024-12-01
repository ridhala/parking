package com.example.parking_cars

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class principal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_principal)
        supportFragmentManager.beginTransaction().replace(R.id.framel,home()).commit()
        val menu=findViewById<BottomNavigationView>(R.id.butoomN)
        menu.setOnItemSelectedListener { item->
            when (item.itemId){
                R.id.home->supportFragmentManager.beginTransaction().replace(R.id.framel,home()).commit()


            }
            return@setOnItemSelectedListener true

        }
    }
}