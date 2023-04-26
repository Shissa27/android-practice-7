package com.example.practica_1.ui.Fragment;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.practica_1.R;
import com.example.practica_1.databinding.FragmentSecondBinding;
import com.example.practica_1.ui.Adapter.CustomViewListAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SecondFragment extends Fragment {
    String TAG = "Fragment 2";

    FragmentSecondBinding binding;
    public String generateRandomAstra() {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append(letters.charAt(rand.nextInt(letters.length())));
        }
        for (int i = 0; i < 2; i++) {
            sb.append(rand.nextInt(10));
        }
        return sb.toString();
    }
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final Random random = new Random();
        List<String> Stars =new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            int num = random.nextInt(700);
            String star = generateRandomAstra();
            Stars.add("Звезда " + star);
        }
        Log.i("PUDGE",Stars.size()+"A");
        CustomViewListAdapter viewListAdapter = new CustomViewListAdapter(binding.getRoot().getContext(), R.layout.vlist_orig,Stars);
        binding.vlist.setAdapter(viewListAdapter);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

}