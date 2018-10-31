package com.example.karma.doctoryourself;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridView;

public class Major extends AppCompatActivity {
    CardView c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_major);
        c1=(CardView) findViewById(R.id.c1);
        c2=(CardView) findViewById(R.id.c2);
        c3=(CardView) findViewById(R.id.c3);
        c4=(CardView) findViewById(R.id.c4);
        c5=(CardView) findViewById(R.id.c5);
        c6=(CardView) findViewById(R.id.c6);
        c7=(CardView) findViewById(R.id.c7);
        c8=(CardView) findViewById(R.id.c8);
        c9=(CardView) findViewById(R.id.c9);
        c10=(CardView) findViewById(R.id.c10);


        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s= "burn";
                 Intent intent = new Intent(Major.this,burn.class);
                startActivity(intent);
            }
        });

        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s= "burn";
                Intent intent = new Intent(Major.this,headinjury.class);
                startActivity(intent);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s= "burn";
                Intent intent = new Intent(Major.this,heartattack.class);
                startActivity(intent);
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s= "burn";
                Intent intent = new Intent(Major.this,bleeding.class);
                startActivity(intent);
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s= "burn";
                Intent intent = new Intent(Major.this,brokenleg.class);
                startActivity(intent);
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s= "burn";
                Intent intent = new Intent(Major.this,choking.class);
                startActivity(intent);
            }
        });
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s= "burn";
                Intent intent = new Intent(Major.this,cpr.class);
                startActivity(intent);
            }
        });
        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s= "burn";
                Intent intent = new Intent(Major.this,spinalinjury.class);
                startActivity(intent);
            }
        });
        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s= "burn";
                Intent intent = new Intent(Major.this,fractures.class);
                startActivity(intent);
            }
        });
        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s= "burn";
                Intent intent = new Intent(Major.this,poisoning.class);
                startActivity(intent);
            }
        });
    }
    public void show(View v)
    {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

}
