package com.example.karma.doctoryourself;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class OtherConditions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_conditions);

    }
    public void ab(View v){
        Intent i=new Intent(OtherConditions.this,AnimalBite.class);
        startActivity(i);
    }
    public void ap(View v){
        Intent i=new Intent(OtherConditions.this,AbdominalPain.class);
        startActivity(i);
    }
    public void d(View v){
        Intent i=new Intent(OtherConditions.this,Diarrhoea.class);
        startActivity(i);
    }
    public void hs(View v){
        Intent i=new Intent(OtherConditions.this,HeatStroke.class);
        startActivity(i);
    }
    public void ibs(View v){
        Intent i=new Intent(OtherConditions.this,InsectBitesStings.class);
        startActivity(i);
    }
    public void dr(View v){
        Intent i=new Intent(OtherConditions.this,Drown.class);
        startActivity(i);
    }

}
