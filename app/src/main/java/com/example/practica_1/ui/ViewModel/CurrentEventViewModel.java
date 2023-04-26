package com.example.practica_1.ui.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.practica_1.data.resources.CurrentEventModel;
import com.example.practica_1.data.sources.CurrentEventDataSource;

import java.util.Random;

public class CurrentEventViewModel extends ViewModel {
    private final MutableLiveData<CurrentEventModel> luckyPerfume;
    public CurrentEventViewModel(){
        luckyPerfume = new MutableLiveData<>(new CurrentEventModel(0, null));
    }
    public LiveData<CurrentEventModel> getCurrentEvent(){
        return luckyPerfume;
    }
    public void nextPartOfSky(){
        Random random = new Random();
        int randInt = random.nextInt(3);
        luckyPerfume.setValue(
                new CurrentEventModel(CurrentEventDataSource.getImage(randInt), CurrentEventDataSource.getName(randInt))
        );
    }
}