package com.example.practica_1.ui.Fragment;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.practica_1.R;
import com.example.practica_1.ui.ViewModel.CurrentEventViewModel;

public class CurrentEvent extends Fragment {

    private CurrentEventViewModel mViewModel;

    public static CurrentEvent newInstance() {
        return new CurrentEvent();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_current_event, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(CurrentEventViewModel.class);
        // TODO: Use the ViewModel
    }

}