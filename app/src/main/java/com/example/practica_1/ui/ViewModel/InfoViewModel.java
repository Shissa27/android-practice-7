package com.example.practica_1.ui.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.practica_1.data.Databases.entity.StarEntity;
import com.example.practica_1.data.repositories.StarRepository;
import com.example.practica_1.data.resources.StarModel;

import java.util.List;
import java.util.Random;

public class InfoViewModel extends AndroidViewModel {
    public int current;
    private StarRepository mRepository;
    private final LiveData<List<StarModel>> mAllStars;
    public String generateRandomAstra() {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append(letters.charAt(rand.nextInt(letters.length())));
        }
        for (int i = 0; i < 2; i++) {
            sb.append(rand.nextInt(10));
        }
        return sb.toString();
    }
    public String generateRandomType() {
        String letters = "OBAFGKM";
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        sb.append(letters.charAt(rand.nextInt(letters.length())));
        return sb.toString();
    }
    public InfoViewModel (Application application) {
        super(application);
        mRepository = new StarRepository(application);
        mAllStars = mRepository.getAllStars();
        current = 0;
    }
    public LiveData<List<StarModel>> getAllStars() { return mAllStars; }
    public void insert(StarModel star) { mRepository
            .insert(new StarEntity(star.getName(), star.getType())); }
    public String getNextStarName(){
        return mAllStars.getValue().get(getAmount()-1).getName();
    }
    public String getNextStarType(){
        return mAllStars.getValue().get(getAmount()-1).getType();
    }
    public int getAmount(){
        return mAllStars.getValue().size();
    }
    public void add(){
        insert(new StarModel("Denebola","A"));
    }
    public void Random(){
        insert(new StarModel(generateRandomAstra(),generateRandomType()));
    }
    public void count(){
        current=(current+1)%mAllStars.getValue().size();
    }
}
