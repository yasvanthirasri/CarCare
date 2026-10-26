
package com.example.carcare;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Vehicle.class}, version = 1, exportSchema = false)
public abstract class VehicleDatabase extends RoomDatabase {

    private static volatile VehicleDatabase INSTANCE;

    public abstract VehicleDao vehicleDao();

    public static VehicleDatabase getInstance(Context context) {
        if (INSTANCE == null) {
            synchronized (VehicleDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(
                            context.getApplicationContext(),
                            VehicleDatabase.class,
                            "carcare_database"
                    ).build();
                }
            }
        }

        return INSTANCE;
    }
}
