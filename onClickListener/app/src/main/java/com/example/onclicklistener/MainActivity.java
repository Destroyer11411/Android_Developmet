package com.example.onclicklistener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvFirst,tvSecond;
    TextView tvThird,tvFourth,tvFifth,tvSixth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvFirst = findViewById(R.id.one);
        tvSecond = findViewById(R.id.two);
        tvThird = findViewById(R.id.three);
        tvFourth = findViewById(R.id.four);
        tvFifth = findViewById(R.id.five);
        tvSixth = findViewById(R.id.six);

        tvFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "First Toast",Toast.LENGTH_SHORT).show();
            }
        });

        tvSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "second Toast",Toast.LENGTH_SHORT).show();

            }
        });

        tvThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Third toast",Toast.LENGTH_SHORT).show();
            }
        });

        tvFourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Fourth Toast",Toast.LENGTH_SHORT).show();
            }
        });

        tvFifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Fifth Toast",Toast.LENGTH_SHORT).show();
            }
        });

        tvSixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Sixth Toast", Toast.LENGTH_SHORT).show();
            }
        });








    }
}