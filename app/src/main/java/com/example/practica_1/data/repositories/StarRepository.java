package com.example.practica_1.data.repositories;

import android.app.Application;
import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;

import com.example.practica_1.data.Databases.Dao.StarDao;
import com.example.practica_1.data.Databases.entity.StarEntity;
import com.example.practica_1.data.Databases.roomDatabase.StarRoomDataBase;
import com.example.practica_1.data.resources.StarModel;

import java.util.List;
import java.util.stream.Collectors;

public class StarRepository {
    private final StarDao mStarDao;
    private final LiveData<List<StarModel>> mAllStars;
    private final Context context;
    private StarRoomDataBase roomDatabase;
    public StarRepository(Application applicationContext) {
        context = applicationContext;
        roomDatabase = StarRoomDataBase.getDatabase(context);
        mStarDao = StarRoomDataBase.getDatabase(context).starDao();
        mAllStars = Transformations.map(mStarDao.getStars(), entities -> entities.stream()
                .map(StarEntity::toStar).collect(Collectors.toList()));
    }
    public LiveData<List<StarModel>> getAllStars() {
        return mAllStars;
    }
    public void insert(StarEntity star) {
        StarRoomDataBase.databaseWriteExecutor.execute(() -> {
            mStarDao.insert(star);
        });
    }
}
