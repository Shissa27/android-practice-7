package com.example.practica_1.data.sources;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Environment;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExternalStorageRegionDataSource {
    private File external_storage_file;
    private Context context;

    public ExternalStorageRegionDataSource(Context context) {
        this.context = context;
        if (ContextCompat.checkSelfPermission(context, android.Manifest.permission.WRITE_EXTERNAL_STORAGE)
                == PackageManager.PERMISSION_GRANTED) {
            external_storage_file = new File(Environment.getExternalStorageDirectory() +"/"+Environment.DIRECTORY_DOWNLOADS, "region_2.txt");

        }
        else {
            ActivityCompat.requestPermissions((Activity)context, new String[]
                    {android.Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
        }
    }

    public void addRegionExternalStorage(String region){
        if (ContextCompat.checkSelfPermission(context, android.Manifest.permission.WRITE_EXTERNAL_STORAGE)
                == PackageManager.PERMISSION_GRANTED) {
            try {
                FileWriter writer = new FileWriter(external_storage_file);
                writer.write(region);
                writer.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
            ActivityCompat.requestPermissions((Activity)context, new String[]
                    {android.Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
        }
    }
}
