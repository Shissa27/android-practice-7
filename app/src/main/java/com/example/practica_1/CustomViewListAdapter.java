package com.example.practica_1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomViewListAdapter extends ArrayAdapter<String> {
    private LayoutInflater layoutInflater;
    private int layout;
    private List<String> stars;

    public CustomViewListAdapter(Context context, int resource, List<String> stars) {
        super(context, resource, stars);
        this.stars = stars;
        this.layout = resource;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = layoutInflater.inflate(this.layout,parent,false);

        TextView textView = view.findViewById(R.id.vlist_text);
        textView.setText(stars.get(position));

        ImageView imageView = view.findViewById(R.id.vlist_star_img);
        imageView.setImageResource(R.drawable.astra);
        return view;
    }
}
