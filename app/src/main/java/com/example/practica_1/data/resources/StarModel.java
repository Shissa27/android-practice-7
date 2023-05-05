package com.example.practica_1.data.resources;

public class StarModel {
    private String name;
    private String type;
    public StarModel(){
        name = "Basic_star";
        type =  "0";
    }
    public StarModel(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String  getType() {
        return type;
    }
}
