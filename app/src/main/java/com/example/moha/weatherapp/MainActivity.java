package com.example.moha.weatherapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;


public class MainActivity extends Activity {


    TextView kirunaBtn, stockholmBtn, goteborgBtn, malmoBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        kirunaBtn = (TextView) findViewById(R.id.kirunaBtn);
        stockholmBtn = (TextView) findViewById(R.id.stockholmBtn);
        goteborgBtn = (TextView) findViewById(R.id.goteborgBtn);
        malmoBtn = (TextView) findViewById(R.id.malmoBtn);



        kirunaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Kiruna.class);
                startActivity(intent);

            }
        });


        stockholmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Stockholm.class);
                startActivity(intent);

            }
        });


        goteborgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Goteborg.class);
                startActivity(intent);

            }
        });


        malmoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Malmo.class);
                startActivity(intent);

            }
        });



    }
}
