package com.example.carcare;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class VehicleListFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(
                R.layout.fragment_vehicle_list,
                container,
                false
        );

        RecyclerView recyclerView =
                view.findViewById(R.id.vehicleRecyclerView);

        recyclerView.setLayoutManager(
                new LinearLayoutManager(requireContext())
        );

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(
                new Vehicle(
                        "Royal Enfield Classic 350",
                        "Motorcycle"
                )
        );

        vehicles.add(
                new Vehicle(
                        "Honda City",
                        "Car"
                )
        );

        vehicles.add(
                new Vehicle(
                        "Hyundai Creta",
                        "SUV"
                )
        );

        VehicleAdapter adapter =
                new VehicleAdapter(vehicles);

        recyclerView.setAdapter(adapter);

        return view;
    }
}