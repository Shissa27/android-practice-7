package com.example.practica_1.data.sources;

import android.content.Context;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppSpecificStorageMapDataSource {
    private File app_specific_storage_file;

    public AppSpecificStorageMapDataSource(Context context) {
        File app_specific_directory = context.getFilesDir();
        app_specific_storage_file = new File(app_specific_directory, "Regions.txt");
    }

    public void addRegionAppSpecific(String region){
        try {
            FileWriter writer = new FileWriter(app_specific_storage_file);
            writer.write(region);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
