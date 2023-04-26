package com.example.practica_1.data.resources;

public class CurrentEventModel {
    private final int imageMap;
    private final String infoConstellation;

    public CurrentEventModel(int imageMap, String infoConstellation) {
        this.imageMap = imageMap;
        this.infoConstellation = infoConstellation;
    }

    public int getImagePerfume() {
        return imageMap;
    }

    public String getNamePerfume() {
        return infoConstellation;
    }
}
