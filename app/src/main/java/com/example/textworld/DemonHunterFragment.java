package com.example.textworld;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class DemonHunterFragment extends Fragment {

    public DemonHunterFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_demon_hunter, container, false);
        Button button = view.findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchFragment(new MainFragment());
            }
        });
        // Inflate the layout for this fragment
        return view;
    }

    private void switchFragment(Fragment fragment){
        FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.fragmentContainer, fragment);
        //fragmentTransaction.addToBackStack(null); // Optional: Adds the transaction to the back stack
        fragmentTransaction.commit();
    }
}