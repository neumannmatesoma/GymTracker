package com.example.gymtracker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.gymtracker.databinding.ActivityMainBinding;

import org.w3c.dom.Text;

import java.time.LocalDate;
import java.util.Date;

import CalendarJava.CalendarDate;

public class MainActivity extends AppCompatActivity {

    Fragment home_fragment;

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        replaceFragment(new HomeFragment());
        binding.bottomNavigationView.setBackground(null);

        binding.bottomNavigationView.setOnItemSelectedListener(item -> {
            if (item.getItemId() == R.id.home_nav_item) { replaceFragment(new HomeFragment()); }
            else if (item.getItemId() == R.id.activity_nav_item) { replaceFragment(new ActivityFragment()); }
            else if (item.getItemId() == R.id.calendar_nav_item) { replaceFragment(new CalendarFragment()); }

            return true;
        });
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit();
    }


    public void start_workout_onClick(View view) {
        startActivity(new Intent(this,WorkoutSelector.class));
    }
}