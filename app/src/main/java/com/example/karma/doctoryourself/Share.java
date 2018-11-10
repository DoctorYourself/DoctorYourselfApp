package com.example.karma.doctoryourself;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Share extends AppCompatActivity {
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);Intent i = new Intent(Intent.ACTION_SEND);

        b=findViewById(R.id.bu);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_SEND);
                i.setType("text/plain");
                String sharebody = "Your body here";
                String sharesub = "Your subject here";
                i.putExtra(Intent.EXTRA_SUBJECT,sharebody);
                i.putExtra(Intent.EXTRA_TEXT,sharesub);
                startActivity(Intent.createChooser(i, "Share using:"));
            }
        });



    }
}
