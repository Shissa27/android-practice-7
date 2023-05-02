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
    public void addRegionAppSpecific(String region){
        mRepository.addRegionAppSpecific(region);
    }
    public void addRegionExternalStorage(String region){
        mRepository.addRegionExternalStorage(region);
    }
    public void addRegionSharedPreferences(String region) {
        mRepository.addRegionSharedPreferences(region);
    }

    public String getRegion(String region) {
        return mRepository.getRegion(region);
    }
}
