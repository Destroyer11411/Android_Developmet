package com.example.interfacelibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public class User{
        public String name;
        public String hometown;

        public User(String name, String hometown) {
            this.name = name;
            this.hometown = hometown;
        }
    }


}