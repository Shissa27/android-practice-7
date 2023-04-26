package com.example.practica_1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.practica_1.databinding.ThirdFragmentBinding;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class ThirdFragment extends Fragment {
    ThirdFragmentBinding binding;
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        List<String> info =new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            info.add("Info " + i);
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        binding.rview.setLayoutManager(linearLayoutManager);

        CustomRecyclerViewAdapter customRecyclerViewAdapter = new CustomRecyclerViewAdapter(getLayoutInflater(),info);
        binding.rview.setAdapter(customRecyclerViewAdapter);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = ThirdFragmentBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }
}