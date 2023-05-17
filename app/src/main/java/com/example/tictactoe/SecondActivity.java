package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
TextView startBtn;
EditText firstName,secondName;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        startBtn=findViewById(R.id.startBtn);



        startBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                final Intent iNext=new Intent(SecondActivity.this,MainActivity.class);

            startActivity(iNext);
            }
        });
    }



}