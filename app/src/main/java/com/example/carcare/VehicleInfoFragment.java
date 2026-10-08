package com.example.carcare;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

public class VehicleInfoFragment extends Fragment {

    private DashboardViewModel viewModel;

    @Nullable
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(
                R.layout.fragment_vehicle_info,
                container,
                false
        );

        TextView vehicleSpeed =
                view.findViewById(R.id.tvVehicleSpeed);

        viewModel = new ViewModelProvider(requireActivity())
                .get(DashboardViewModel.class);

        viewModel.speed.observe(
                getViewLifecycleOwner(),
                newSpeed -> {
                    vehicleSpeed.setText(
                            "Vehicle Speed: " + newSpeed + " km/h"
                    );
                }
        );

        return view;
    }
}