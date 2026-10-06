package com.example.carcare;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

public class DashboardFragment extends Fragment {

    private DashboardViewModel viewModel;

    @Nullable
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(
                R.layout.fragment_dashboard,
                container,
                false
        );

        TextView speedText = view.findViewById(R.id.tvSpeed);
        Button increaseButton = view.findViewById(R.id.btnIncreaseSpeed);
        Button setSpeedButton = view.findViewById(R.id.btnSetSpeed);

        viewModel = new ViewModelProvider(this)
                .get(DashboardViewModel.class);

        viewModel.speed.observe(getViewLifecycleOwner(), newSpeed -> {
            speedText.setText("Speed: " + newSpeed + " km/h");
        });

        increaseButton.setOnClickListener(v -> {
            viewModel.increaseSpeed();
        });

        setSpeedButton.setOnClickListener(v -> {
            viewModel.setSpeed(50);
        });

        Button vehicleDetailsButton =
                view.findViewById(R.id.btnVehicleDetails);

        vehicleDetailsButton.setOnClickListener(v -> {

            Intent intent = new Intent(
                    requireContext(),
                    VehicleActivity.class
            );

            intent.putExtra("vehicle_name", "Royal Enfield");

            startActivity(intent);
        });

        return view;
    }
}