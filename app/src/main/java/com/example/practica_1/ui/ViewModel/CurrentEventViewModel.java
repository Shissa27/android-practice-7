package com.example.practica_1.ui.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.practica_1.data.repositories.CurrentEventRepository;
import com.example.practica_1.data.resources.CurrentEventModel;
import com.example.practica_1.data.sources.CurrentEventDataSource;

import java.util.Random;

public class CurrentEventViewModel extends ViewModel {
    public int current;
    private final MutableLiveData<CurrentEventRepository> eventsRepository;
    public CurrentEventViewModel(){
        eventsRepository = new MutableLiveData<>(new CurrentEventRepository());
        current = 0;
    }
    public LiveData<CurrentEventRepository> getCurrentEvent(){
        return eventsRepository;
    }
    public void nextPartOfSky(){
        current = (current+1)%eventsRepository.getValue().events.length;
        eventsRepository.setValue(new CurrentEventRepository());
    }
    public CurrentEventModel getI(){
        return eventsRepository.getValue().events[current];
    }
}