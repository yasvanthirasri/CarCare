package com.example.carcare;

import androidx.lifecycle.ViewModel;

public class DashboardViewModel extends ViewModel {
    int speed =100;
    public void increaseSpeed() {
        speed += 10;
    }
}
