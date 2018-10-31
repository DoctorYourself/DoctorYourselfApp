package com.example.karma.doctoryourself;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.support.v7.widget.CardView;
        import android.view.View;

public class Minor extends AppCompatActivity {
    CardView c1,c2,c3,c4,c5,c6,c7,c8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minor);
        c1=(CardView) findViewById(R.id.c1);
        c2=(CardView) findViewById(R.id.c2);
        c3=(CardView) findViewById(R.id.c3);
        c4=(CardView) findViewById(R.id.c4);
        c5=(CardView) findViewById(R.id.c5);
        c6=(CardView) findViewById(R.id.c6);
        c7=(CardView) findViewById(R.id.c7);
        c8=(CardView) findViewById(R.id.c8);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s= "burn";
                Intent intent = new Intent(Minor.this,cutsandwounds.class);
                startActivity(intent);
            }
        });

        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s= "burn";
                Intent intent = new Intent(Minor.this,bruises.class);
                startActivity(intent);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s= "burn";
                Intent intent = new Intent(Minor.this,nosebleed.class);
                startActivity(intent);
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s= "burn";
                Intent intent = new Intent(Minor.this,sprains.class);
                startActivity(intent);
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s= "burn";
                Intent intent = new Intent(Minor.this,sunburn.class);
                startActivity(intent);
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s= "burn";
                Intent intent = new Intent(Minor.this,splinter.class);
                startActivity(intent);
            }
        });
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s= "burn";
                Intent intent = new Intent(Minor.this,blister.class);
                startActivity(intent);
            }
        });
        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s= "burn";
                Intent intent = new Intent(Minor.this,eyeinjury.class);
                startActivity(intent);
            }
        });

    }
}
