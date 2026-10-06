package com.example.carcare;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class VehicleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle);

        TextView vehicleText = findViewById(R.id.tvSelectedVehicle);

        String vehicleName =
                getIntent().getStringExtra("vehicle_name");

        vehicleText.setText(vehicleName);
    }
}