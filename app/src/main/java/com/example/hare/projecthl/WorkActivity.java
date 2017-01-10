package com.example.hare.projecthl;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class WorkActivity extends AppCompatActivity {

    ImageButton bt1,bt2,bt3,bt4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work);


        bt1 = (ImageButton) findViewById(R.id.imageButton);

        bt1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentpu = new Intent(WorkActivity.this, Wor1Activity.class);

                startActivity(intentpu);

            }
        });

        bt2 = (ImageButton) findViewById(R.id.imageButton6);

        bt2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentpu = new Intent(WorkActivity.this, Wor3Activity.class);

                startActivity(intentpu);

            }
        });

        bt3 = (ImageButton) findViewById(R.id.imageButton7);

        bt3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentpu = new Intent(WorkActivity.this, Wor4Activity.class);

                startActivity(intentpu);

            }
        });

        bt4 = (ImageButton) findViewById(R.id.imageButton5);

        bt4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentpu = new Intent(WorkActivity.this, Wor2Activity.class);

                startActivity(intentpu);

            }
        });

    }
}
