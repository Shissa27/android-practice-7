package com.example.practica_1.data.sources;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferencesStorageDataSource {
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    public SharedPreferencesStorageDataSource(Context context) {
        sharedPreferences = context.getSharedPreferences("region", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    public void addRegionSharedPreferences(String region) {
        editor.putString("region", region);
        editor.apply();
    }

    public String getRegion(String region) {
        return sharedPreferences.getString(region, "Base_region");
    }
}
