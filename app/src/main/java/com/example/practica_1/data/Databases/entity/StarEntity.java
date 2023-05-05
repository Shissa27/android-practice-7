package com.example.practica_1.data.Databases.entity;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.practica_1.data.resources.StarModel;

@Entity(tableName = "star_table")
public class StarEntity {
    @PrimaryKey(autoGenerate = true)
    private int id;

    private String name;
    private String type;

    public StarEntity(@NonNull String name, String type) {
        this.name = name;
        this.type = type;
    }
    @NonNull
    public String getName() {
        return this.name;
    }
    public void setName(@NonNull String name) {
        this.name = name;
    }
    public int getId() {
        return this.id;
    }
    public void setId(@NonNull int id) {
        this.id = id;
    }
    public String getType() {
        return this.type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public StarModel toStar() {
        return new StarModel(this.name, this.type);
    }
}
