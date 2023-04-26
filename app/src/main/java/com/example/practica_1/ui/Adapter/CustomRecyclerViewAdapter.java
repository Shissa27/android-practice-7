package com.example.practica_1.ui.Adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.practica_1.R;

import java.util.List;

public class CustomRecyclerViewAdapter extends RecyclerView.Adapter<CustomRecyclerViewAdapter.ViewHolder> {
    private LayoutInflater inflater;
    private List<String> INFO;
    private Context context;


    public CustomRecyclerViewAdapter(LayoutInflater inflater, List<String> INFO) {
        this.inflater = inflater;
        this.INFO = INFO;
        this.context = context;
    }
    @NonNull
    @Override
    public CustomRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.vlist_orig,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomRecyclerViewAdapter.ViewHolder holder, int position) {
        holder.Star.setText(INFO.get(position));
        holder.Star_img.setImageResource(R.drawable.infoicon);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,INFO.get(holder.getAdapterPosition()),Toast.LENGTH_SHORT).show();
                Log.i("RecyclerView",INFO.get(holder.getAdapterPosition()));
            }
        });
    }
    @Override
    public int getItemCount() {
        return INFO.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView Star;
        ImageView Star_img;

        public ViewHolder(View view){
            super(view);
            Star = view.findViewById(R.id.vlist_text);
            Star_img = view.findViewById(R.id.vlist_star_img);
        }
    }
}
