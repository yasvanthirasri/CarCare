
package com.example.carcare;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface VehicleDao {

    @Insert
    void insertVehicle(Vehicle vehicle);

    @Query("SELECT * FROM vehicles")
    List<Vehicle> getAllVehicles();

    @Delete
    void deleteVehicle(Vehicle vehicle);
}
