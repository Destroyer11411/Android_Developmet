package com.example.bcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edFirstvalue, edSecondvalue;
    TextView tvAns;
    Button add, sub,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edFirstvalue = findViewById(R.id.edFirstvalue);
        edSecondvalue = findViewById(R.id.edSecondvalue);
        tvAns = findViewById(R.id.ansField);
        add = findViewById(R.id.addBtn);
        sub = findViewById(R.id.subBtn);
        mul = findViewById(R.id.mulBtn);
        div = findViewById(R.id.divBtn);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue, secondValue,ans;

                firstValue = Integer.parseInt(edFirstvalue.getText().toString());
                secondValue = Integer.parseInt(edSecondvalue.getText().toString());
                ans = firstValue + secondValue;

                tvAns.setText("Ans is = " +ans );

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue, secondValue,ans;

                firstValue = Integer.parseInt(edFirstvalue.getText().toString());
                secondValue = Integer.parseInt(edSecondvalue.getText().toString());
                ans = firstValue - secondValue;

                tvAns.setText("Ans is = " +ans );

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue, secondValue,ans;

                firstValue = Integer.parseInt(edFirstvalue.getText().toString());
                secondValue = Integer.parseInt(edSecondvalue.getText().toString());
                ans = firstValue * secondValue;

                tvAns.setText("Ans is = " +ans );

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue, secondValue,ans;

                firstValue = Integer.parseInt(edFirstvalue.getText().toString());
                secondValue = Integer.parseInt(edSecondvalue.getText().toString());
                ans = firstValue / secondValue;

                tvAns.setText("Ans is = " +ans );

            }
        });




    }
}