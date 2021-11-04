package com.gmail.hamedvakhide.logutilexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.gmail.hamedvakhide.easylog.EasyLog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EasyLog.d("HAHAHAHA");
    }
}