package com.example.practica_1.ui.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.practica_1.R;
import com.example.practica_1.data.resources.StarModel;
import com.example.practica_1.databinding.FragmentInfoBinding;
import com.example.practica_1.ui.ViewModel.InfoViewModel;


public class InfoFragment extends Fragment {

    InfoViewModel infoViewModel;
    FragmentInfoBinding binding;
    public InfoFragment() {
        super(R.layout.fragment_info);
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        infoViewModel = new ViewModelProvider(this).get(InfoViewModel.class);
        binding.infoFragmentBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StarModel star = new StarModel();
                infoViewModel.insert(star);
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentInfoBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}