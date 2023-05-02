package com.example.practica_1.ui.ViewModel;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;

import com.example.practica_1.data.repositories.MapRepository;

public class MapViewModel extends AndroidViewModel {
    private MapRepository mRepository;
    public MapViewModel (Application application) {
        super(application);
        mRepository = new MapRepository(application);
    }
    public void addNameAppSpecific(String region){
        mRepository.addNameAppSpecific(region);
    }
    public void addRegionExternalStorage(String region){
        mRepository.addRegionExternalStorage(region);
    }
}
