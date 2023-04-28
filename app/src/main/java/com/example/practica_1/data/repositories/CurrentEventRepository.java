package com.example.practica_1.data.repositories;

import com.example.practica_1.data.resources.CurrentEventModel;
import com.example.practica_1.data.sources.CurrentEventDataSource;

public class CurrentEventRepository {
    private static int cur = 0 ;
    private CurrentEventModel[] events;
    public CurrentEventRepository() {
        events = new CurrentEventModel[3];
        for (int i = 0; i < 3; i++) {
            events[i] = new CurrentEventModel(CurrentEventDataSource.getImage(i),CurrentEventDataSource.getName(i));
        }
        cur=(cur+1)%3;
    }

    public CurrentEventModel getEvent() {
        return events[cur];
    }
    public void changeCur(){
        cur = (cur+1) % 3;
    }

}
