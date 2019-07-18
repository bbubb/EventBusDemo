package com.example.eventbusdemo;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import org.greenrobot.eventbus.EventBus;


public class ButtonFragment extends Fragment {

    private Button btnCount;
    int count = 0;

    public ButtonFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_button, container, false);

        btnCount = view.findViewById(R.id.btn_count);
        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post(new EventCount(++count));

            }
        });

        return view;
    }
}