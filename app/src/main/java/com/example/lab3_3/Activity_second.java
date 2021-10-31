package com.example.lab3_3;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;


import com.example.lab3_3.databinding.ActivitySecondBinding;

public class Activity_second extends AppCompatActivity {
    ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Activity 2");
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        binding.bt2To1.setOnClickListener(view1 -> finish());
        binding.bt2To3.setOnClickListener(view12 -> {
            Intent intent = new Intent(Activity_second.this,Activity_third.class);
            startActivity(intent);
        });
    }

   

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.my_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.activity_about) {
            Intent intent = new Intent(Activity_second.this, Activity_about.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

}