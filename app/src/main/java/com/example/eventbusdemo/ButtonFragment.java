package com.example.eventbusdemo;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;


public class ButtonFragment extends Fragment {

    Button btnCount;
    EventCount eventCount;

    public ButtonFragment() {

    }

    @Override
    public void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_button, container, false);

        btnCount = view.findViewById(R.id.btn_count);
        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onCountEventClick(eventCount);
                EventBus.getDefault().post(new EventCount(eventCount.COUNT));

            }
        });

        return view;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public Integer onCountEventClick(EventCount eventCount){
        eventCount.COUNT = ++eventCount.COUNT;
        return eventCount.COUNT;
    }

    @Override
    public void onStop() {
        EventBus.getDefault().unregister(this);
        super.onStop();
    }
}
