package com.example.carcare;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.carcare.R;

public class MainActivity extends AppCompatActivity {
    int speed = 60;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        TextView speedText = findViewById(R.id.tvSpeed);
        DashboardViewModel viewModel = new ViewModelProvider(this).get(DashboardViewModel.class);
        if(savedInstanceState==null){
            speed = 90;
        }
        Button increaseButton = findViewById(R.id.btnIncreaseSpeed);

        increaseButton.setOnClickListener(v -> {
            viewModel.increaseSpeed();

            speedText.setText("Speed: " + viewModel.speed + " km/h");
        });
        speedText.setText("Speed: " + viewModel.speed + " km/h");
    }
}