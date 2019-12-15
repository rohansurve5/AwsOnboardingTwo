package com.nexteducate.awsonboardingtwo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.nexteducate.awsonboardingtwo.adapter.ViewpagerAdapter;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    ViewpagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);

        adapter = new ViewpagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(adapter);



    }
}
