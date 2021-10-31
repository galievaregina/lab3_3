package com.example.lab3_3;

import androidx.annotation.NonNull;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.example.lab3_3.databinding.ActivityFirstBinding;

public class Activity_first extends AppCompatActivity {
    ActivityFirstBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Activity 1");
        super.onCreate(savedInstanceState);
        binding = ActivityFirstBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        binding.bt1To2.setOnClickListener(view1 -> {
            Intent intent = new Intent(Activity_first.this, Activity_second.class);
            startActivity(intent);
        });
        binding.bt1To1.setOnClickListener(view1 -> {
            Intent intent = new Intent(Activity_first.this, Activity_first.class);
            startActivity(intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP));
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
            Intent intent = new Intent(Activity_first.this, Activity_about.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}