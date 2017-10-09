package com.example.coco.mvvmdemo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.coco.mvvmdemo.databinding.ActivityMainBinding;
import com.example.coco.mvvmdemo.model.MainViewModel;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding amb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        amb = DataBindingUtil.setContentView(this, R.layout.activity_main);
        MainViewModel mainViewModel = new MainViewModel(this, amb);

    }

}
