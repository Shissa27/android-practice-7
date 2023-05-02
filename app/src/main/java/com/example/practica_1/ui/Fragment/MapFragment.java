package com.example.practica_1.ui.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.practica_1.R;
import com.example.practica_1.databinding.FragmentMapBinding;
import com.example.practica_1.ui.ViewModel.MapViewModel;


public class MapFragment extends Fragment {
    FragmentMapBinding binding;
    MapViewModel mapViewModel;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mapViewModel = new ViewModelProvider(this).get(mapViewModel.getClass());

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMapBinding.inflate(inflater,container,false);


        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.buttonAppSpec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mapViewModel.addNameAppSpecific("Europe");
            }
        });
        binding.buttonExternal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mapViewModel.addRegionExternalStorage("Asia");
            }
        });
    }
}