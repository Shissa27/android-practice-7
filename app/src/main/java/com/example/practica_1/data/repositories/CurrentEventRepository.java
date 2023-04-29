package com.example.practica_1.data.repositories;

import com.example.practica_1.data.resources.CurrentEventModel;
import com.example.practica_1.data.sources.CurrentEventDataSource;

public class CurrentEventRepository {
    private static int cur = 0;
    public CurrentEventModel[] events;

    public CurrentEventRepository() {
        events = CurrentEventDataSource.consts;
    }
    public CurrentEventModel[] getEvents() {
        return events;
    }
    public void changeCur(){
        cur = (cur+1) % 3;
    }

}
