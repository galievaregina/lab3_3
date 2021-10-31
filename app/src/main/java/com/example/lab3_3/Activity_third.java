package com.example.lab3_3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.example.lab3_3.databinding.ActivityThirdBinding;

public class Activity_third extends AppCompatActivity {
    ActivityThirdBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Activity 3");
        super.onCreate(savedInstanceState);
        binding = ActivityThirdBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        binding.bt3To2.setOnClickListener(view1 -> {
            finish();
        });
        binding.bt3To1.setOnClickListener(view1 -> {
            Intent intent = new Intent(Activity_third.this, Activity_first.class);
            startActivity(intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
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
            Intent intent = new Intent(Activity_third.this, Activity_about.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}