package com.nexteducate.awsonboardingtwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.nexteducate.awsonboardingtwo.adapter.Grid_BaseAdapter;

public class InterestsActivity extends AppCompatActivity {

    private GridView gridView;
    Grid_BaseAdapter grid_baseAdapter;

    int [] images = {R.drawable.sport,R.drawable.fashion,R.drawable.food,R.drawable.design,R.drawable.music,R.drawable.travel,R.drawable.tech,R.drawable.animal,
    R.drawable.culture};

    String [] data = {"Sport","Fashion","Food","Design","Music",
    "Travel","Tech","Animal","Culture"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interests);

        gridView = findViewById(R.id.gridView);

        grid_baseAdapter = new Grid_BaseAdapter(this,images,data);

        gridView.setAdapter(grid_baseAdapter);


    }
}
