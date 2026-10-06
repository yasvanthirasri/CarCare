package com.example.carcare;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DashboardViewModel extends ViewModel {
    MutableLiveData<Integer> speed = new MutableLiveData<>(90);
    public void increaseSpeed() {
        speed.setValue(speed.getValue() + 10);
    }

    public void setSpeed(int newSpeed) {
        speed.setValue(newSpeed);
    }
}
