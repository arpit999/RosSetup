package com.hoemtech.rossetup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.ros.android.view.RosTextView;

public class MainActivity extends AppCompatActivity {

    // For Test of the ROS
    RosTextView rosTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}