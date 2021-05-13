package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;


public class MainActivity extends AppCompatActivity {

    TextView numbers, family, colors, phrases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        numbers = findViewById(R.id.numbers);
//
//        numbers.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent number = new Intent(MainActivity.this,number_activity.class);
//                startActivity(number);
//            }
//        });
//
//        family = findViewById(R.id.family);
//
//        family.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent family = new Intent(MainActivity.this,family_activity.class);
//                startActivity(family);
//            }
//        });
//
//
//        colors = findViewById(R.id.colors);
//
//        colors.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent colors = new Intent(MainActivity.this,colors_activity.class);
//                startActivity(colors);
//            }
//        });
//
//
//        phrases = findViewById(R.id.phrases);
//
//        phrases.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent phrases = new Intent(MainActivity.this,phrases_activity.class);
//                startActivity(phrases);
//            }
//        });

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);

        pagerAdapter adapter = new pagerAdapter(MainActivity.this,getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);




    }



}