package com.example.codeforcommunityapp;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

public class MainActivity extends AppCompatActivity {
    private NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the NavController instance
        navController = Navigation.findNavController(this, R.id.nav_host_fragment);

        ImageButton btnHome = findViewById(R.id.homelogo);
        ImageButton btnFood = findViewById(R.id.foodlogo);

        if (btnHome != null) {
            btnHome.setOnClickListener(v -> {
                try {
                    // Navigate to the home page
                    navController.navigate(R.id.homePage);
                } catch (IllegalArgumentException e) {
                    Log.e("Navigation", "Unable to find NavController", e);
                }
            });
        } else {
            Log.e("UI", "Home button not found in layout");
        }

        if (btnFood != null) {
            btnFood.setOnClickListener(v -> {
                try {
                    // Navigate to the food fragment
                    navController.navigate(R.id.foodFragment);
                } catch (IllegalArgumentException e) {
                    Log.e("Navigation", "Unable to find NavController", e);
                }
            });
        } else {
            Log.e("UI", "Food button not found in layout");
        }
    }
}