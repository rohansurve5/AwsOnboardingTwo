package com.nexteducate.awsonboardingtwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ListActivity extends AppCompatActivity {

    private TextView tv_one, tv_two , tv_three , tv_four , tv_five , tv_six , tv_seven;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        tv_one = findViewById(R.id.tv_one);
        tv_two = findViewById(R.id.tv_two);
        tv_three = findViewById(R.id.tv_three);
        tv_four = findViewById(R.id.tv_four);
        tv_five = findViewById(R.id.tv_five);
        tv_six = findViewById(R.id.tv_six);
        tv_seven = findViewById(R.id.tv_seven);

        tv_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(ListActivity.this,FavDish.class));

            }
        });

        tv_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(ListActivity.this,FavroiteCategory.class));
            }
        });

        tv_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(ListActivity.this,HowitWork.class));
            }
        });

        tv_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(ListActivity.this,InterestsActivity.class));
            }
        });

        tv_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(ListActivity.this,ScreenThree.class));
            }
        });

        tv_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(ListActivity.this,ScreenSix.class));
            }
        });

        tv_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(ListActivity.this,MainActivity.class));
            }
        });
    }
}
