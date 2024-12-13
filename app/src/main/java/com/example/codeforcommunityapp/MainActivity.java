package com.example.codeforcommunityapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton btnHome = findViewById(R.id.homelogo);
        ImageButton btnFood=findViewById(R.id.foodlogo);
        if (btnHome != null) {
            btnHome.setOnClickListener(v -> {
                try {
                    NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
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
                    NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
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