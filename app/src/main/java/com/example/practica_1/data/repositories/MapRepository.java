package com.example.practica_1.data.repositories;

import android.content.Context;

import com.example.practica_1.data.sources.AppSpecificStorageMapDataSource;

public class MapRepository {
    private AppSpecificStorageMapDataSource appSpecificStorageRegionDataSource;
    public MapRepository(Context context) {
       appSpecificStorageRegionDataSource = new AppSpecificStorageMapDataSource(context);
    }
    public void addNameAppSpecific(String region){
        appSpecificStorageRegionDataSource.addRegionAppSpecific(region);
    }

}
