package com.example.lab3_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.Menu
import android.view.MenuItem
import android.view.View
import com.example.lab3_3.databinding.ActivityFirstBinding

class MainActivity : AppCompatActivity() {
    var binding: ActivityFirstBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        title = "Activity 1"
        super.onCreate(savedInstanceState)
        binding = ActivityFirstBinding.inflate(layoutInflater)
        val view: View = binding!!.root
        setContentView(view)
        binding!!.bnToSecond.setOnClickListener {
            val intent = Intent(this@MainActivity, ActivitySecond::class.java)
            startActivity(intent)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.my_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.activity_about) {
            val intent = Intent(this@MainActivity, ActivityAbout::class.java)
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)
    }
}