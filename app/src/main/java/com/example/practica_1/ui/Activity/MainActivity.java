package com.example.practica_1.ui.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.example.practica_1.R;
import com.example.practica_1.databinding.FragmentFirstBinding;
import com.example.practica_1.databinding.NewmainlayoutBinding;

import com.example.practica_1.databinding.ViewBinding;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "myLogs";//Тег - метка для сообщения
    int duration = Toast.LENGTH_SHORT;
    Button button_map, button_info, button_location,button_find;
    FrameLayout frameLayout;
    private void addFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container_view, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.setReorderingAllowed(true);
        fragmentTransaction.commit();
    }
    private void replaceFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction().setReorderingAllowed(true);
        fragmentTransaction.replace(R.id.fragment_container_view,fragment);
        fragmentTransaction.commit();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newmainlayout);

    }

}