package com.example.lab3_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab3_3.R

class ActivityAbout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        title = "Activity about"
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_about)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}