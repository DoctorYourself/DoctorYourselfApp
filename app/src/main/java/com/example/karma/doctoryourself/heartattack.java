package com.example.karma.doctoryourself;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class heartattack extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heartattack);
    }
    public void show(View v)
    {
        Intent i = new Intent(this,Major.class);
        startActivity(i);
    }
}
