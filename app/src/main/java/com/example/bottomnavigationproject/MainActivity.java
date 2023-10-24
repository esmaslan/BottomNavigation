package com.example.bottomnavigationproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView=findViewById(R.id.bottomNavigation);

        getSupportFragmentManager().beginTransaction().add(R.id.frame_layout,new Fragment(R.layout.pass_fragment)).commit();

        new BottomNavigationView.OnNavigationItemSelectedListener(bottomNavigationListener);
    }


    public final BottomNavigationView.OnNavigationItemSelectedListener bottomNavigationListener=new BottomNavigationView.OnNavigationItemSelectedListener();



}