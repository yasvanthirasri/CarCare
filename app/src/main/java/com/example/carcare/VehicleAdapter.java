package com.example.carcare;



import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class VehicleAdapter
        extends RecyclerView.Adapter<VehicleAdapter.VehicleViewHolder> {

    private List<Vehicle> vehicleList;

    public VehicleAdapter(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    @NonNull
    @Override
    public VehicleViewHolder onCreateViewHolder(
            @NonNull ViewGroup parent,
            int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_vehicle, parent, false);

        return new VehicleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(
            @NonNull VehicleViewHolder holder,
            int position) {

        Vehicle vehicle = vehicleList.get(position);

        holder.vehicleName.setText(vehicle.getName());
        holder.vehicleType.setText(vehicle.getType());
    }

    @Override
    public int getItemCount() {
        return vehicleList.size();
    }

    static class VehicleViewHolder
            extends RecyclerView.ViewHolder {

        TextView vehicleName;
        TextView vehicleType;

        public VehicleViewHolder(@NonNull View itemView) {
            super(itemView);

            vehicleName =
                    itemView.findViewById(R.id.tvVehicleName);

            vehicleType =
                    itemView.findViewById(R.id.tvVehicleType);
        }
    }
}