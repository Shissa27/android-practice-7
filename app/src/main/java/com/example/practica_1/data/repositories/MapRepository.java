package com.example.practica_1.data.repositories;

import android.content.Context;

import com.example.practica_1.data.sources.AppSpecificStorageMapDataSource;
import com.example.practica_1.data.sources.ExternalStorageRegionDataSource;

public class MapRepository {
    private AppSpecificStorageMapDataSource appSpecificStorageRegionDataSource;
    private ExternalStorageRegionDataSource externalStorageNameDataSource;
    public MapRepository(Context context) {
       appSpecificStorageRegionDataSource = new AppSpecificStorageMapDataSource(context);
    }
    public void addNameAppSpecific(String region){
        appSpecificStorageRegionDataSource.addRegionAppSpecific(region);
    }
    public void addRegionExternalStorage(String region){
        externalStorageNameDataSource.addRegionExternalStorage(region);
    }
}
