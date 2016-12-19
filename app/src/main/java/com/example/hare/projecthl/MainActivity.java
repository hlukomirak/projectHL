package com.example.hare.projecthl;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    ImageButton bt1;
    ImageButton bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1 = (ImageButton) findViewById(R.id.imageButton3);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentex = new Intent(MainActivity.this, ExerActivity.class);

                startActivity(intentex);

            }
        });

        bt2 = (ImageButton) findViewById(R.id.imageButton4);

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentwr = new Intent(MainActivity.this, WorkActivity.class);
                startActivity(intentwr);
            }
        });

    }
}
