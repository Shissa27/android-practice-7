package com.example.practica_1.ui.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.practica_1.data.repositories.CurrentEventRepository;
import com.example.practica_1.data.resources.CurrentEventModel;
import com.example.practica_1.data.sources.CurrentEventDataSource;

import java.util.Random;

public class CurrentEventViewModel extends ViewModel {
    private final MutableLiveData<CurrentEventRepository> eventsRepository;
    public CurrentEventViewModel(){
        eventsRepository = new MutableLiveData<>(new CurrentEventRepository());
    }
    public LiveData<CurrentEventRepository> getCurrentEvent(){
        return eventsRepository;
    }
    public void nextPartOfSky(){
        eventsRepository.setValue(new CurrentEventRepository());
    }
}