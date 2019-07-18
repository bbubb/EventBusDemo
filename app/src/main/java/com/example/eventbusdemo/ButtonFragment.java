package com.example.eventbusdemo;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ButtonFragment extends Fragment {


    public ButtonFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_button, container, false);


        return view;
    }

}
