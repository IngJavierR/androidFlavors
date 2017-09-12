package com.practice.flavors;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.practice.flavors.flavorspractice.R;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }


    public static SecondActivity newInstance() {
        SecondActivity fragment = new SecondActivity();
        return fragment;
    }
}
