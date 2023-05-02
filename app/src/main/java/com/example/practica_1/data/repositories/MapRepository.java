package com.example.practica_1.data.repositories;

import android.content.Context;

import com.example.practica_1.data.sources.AppSpecificStorageMapDataSource;
import com.example.practica_1.data.sources.ExternalStorageRegionDataSource;
import com.example.practica_1.data.sources.SharedPreferencesStorageDataSource;

public class MapRepository {
    private AppSpecificStorageMapDataSource appSpecificStorageRegionDataSource;
    private ExternalStorageRegionDataSource externalStorageMapDataSource;

    private SharedPreferencesStorageDataSource sharedPreferencesStorageDataSource;

    public MapRepository(Context context) {
       appSpecificStorageRegionDataSource = new AppSpecificStorageMapDataSource(context);
       externalStorageMapDataSource = new ExternalStorageRegionDataSource(context);
        sharedPreferencesStorageDataSource = new SharedPreferencesStorageDataSource(context);
    }
    public void addRegionAppSpecific(String region){
        appSpecificStorageRegionDataSource.addRegionAppSpecific(region);
    }
    public void addRegionExternalStorage(String region){
        externalStorageMapDataSource.addRegionExternalStorage(region);
    }
    public void addRegionSharedPreferences(String region) {
        sharedPreferencesStorageDataSource.addRegionSharedPreferences(region);
    }

    public String getRegion(String region) {
        return sharedPreferencesStorageDataSource.getRegion(region);
    }
}
