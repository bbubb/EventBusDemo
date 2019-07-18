package com.example.eventbusdemo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class MainActivity extends AppCompatActivity {
    ButtonFragment buttonFragment;
    CounterFragment counterFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonFragment = (ButtonFragment)getSupportFragmentManager().findFragmentById(R.id.button_fragment);
        counterFragment = (CounterFragment) getSupportFragmentManager().findFragmentById(R.id.counter_fragment);


    }
}
