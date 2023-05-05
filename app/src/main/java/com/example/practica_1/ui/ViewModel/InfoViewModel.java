package com.example.practica_1.ui.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.practica_1.data.Databases.entity.StarEntity;
import com.example.practica_1.data.repositories.StarRepository;
import com.example.practica_1.data.resources.StarModel;

import java.util.List;

public class InfoViewModel extends AndroidViewModel {
    private StarRepository mRepository;
    private final LiveData<List<StarModel>> mAllStars;
    public InfoViewModel (Application application) {
        super(application);
        mRepository = new StarRepository(application);
        mAllStars = mRepository.getAllStars();
    }
    public LiveData<List<StarModel>> getAllStars() { return mAllStars; }
    public void insert(StarModel star) { mRepository
            .insert(new StarEntity(star.getName(), star.getType())); }
}
