package com.example.practica_1.data.sources;

import com.example.practica_1.R;
import com.example.practica_1.data.resources.CurrentEventModel;

public class CurrentEventDataSource {
    private static final String[] info = {"Созведие Малой Медведицы и дракона", "Созвездие Льва", "Созвездие Девы"};
    private static final Integer[] images = {R.drawable.small_medved, R.drawable.lev, R.drawable.deva};

    public static final CurrentEventModel[] consts = {
            new CurrentEventModel(R.drawable.small_medved,"Созведие Малой Медведицы и дракона"),
            new CurrentEventModel(R.drawable.lev,"Созвездие Льва"),
            new CurrentEventModel( R.drawable.deva,"Созвездие Девы")
    };

    public static String getName(int index){
        return info[index];
    }

    public static Integer getImage(int index){
        return images[index];
    }
}
