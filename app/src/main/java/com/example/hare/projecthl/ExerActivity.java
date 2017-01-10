package com.example.hare.projecthl;

import android.animation.TimeAnimator;
import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TabHost;
import android.widget.TableLayout;

public class ExerActivity extends AppCompatActivity {

    ImageButton bt1;
    ImageButton bt3;
    ImageButton bt4;
    ImageButton bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12,bt13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exer);
        TabHost tabHost = (TabHost)findViewById(R.id.tabHost);
        tabHost.setup();

        TabHost.TabSpec tabSpec1 = tabHost.newTabSpec("Chest");
        tabSpec1.setContent(R.id.Chest);
        tabSpec1.setIndicator("CHEST");
        tabHost.addTab(tabSpec1);




        TabHost.TabSpec tabSpec2 = tabHost.newTabSpec("Arms");
        tabSpec2.setContent(R.id.Arms);
        tabSpec2.setIndicator("ARMS");
        tabHost.addTab(tabSpec2);

        TabHost.TabSpec tabSpec3 = tabHost.newTabSpec("ABS");
        tabSpec3.setContent(R.id.ABS);
        tabSpec3.setIndicator("ABS");
        tabHost.addTab(tabSpec3);

        TabHost.TabSpec tabSpec4 = tabHost.newTabSpec("LEGS");
        tabSpec4.setContent(R.id.LEGS);
        tabSpec4.setIndicator("LEGS");
        tabHost.addTab(tabSpec4);


        bt1 = (ImageButton) findViewById(R.id.imageButton2);

        bt1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentpu = new Intent(ExerActivity.this, PushActivity.class);

                startActivity(intentpu);

            }
        });

        bt3 = (ImageButton) findViewById(R.id.imageButton9);

        bt3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentba = new Intent(ExerActivity.this, BurpActivity.class);

                startActivity(intentba);

            }
        });

        bt4 = (ImageButton) findViewById(R.id.imageButton10);

        bt4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentwd = new Intent(ExerActivity.this, WideActivity.class);

                startActivity(intentwd);

            }
        });

        bt5 = (ImageButton) findViewById(R.id.imageButton12);

        bt5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentwd = new Intent(ExerActivity.this, WideActivity.class);

                startActivity(intentwd);

            }
        });

        bt6 = (ImageButton) findViewById(R.id.imageButton11);

        bt6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentwd = new Intent(ExerActivity.this, WideActivity.class);

                startActivity(intentwd);

            }
        });

        bt7 = (ImageButton) findViewById(R.id.imageButton8);

        bt7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentwd = new Intent(ExerActivity.this, WideActivity.class);

                startActivity(intentwd);

            }
        });

        bt8 = (ImageButton) findViewById(R.id.imageButton14);

        bt8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentwd = new Intent(ExerActivity.this, WideActivity.class);

                startActivity(intentwd);

            }
        });

        bt9 = (ImageButton) findViewById(R.id.imageButton15);

        bt9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentwd = new Intent(ExerActivity.this, WideActivity.class);

                startActivity(intentwd);

            }
        });

        bt10 = (ImageButton) findViewById(R.id.imageButton13);

        bt10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentwd = new Intent(ExerActivity.this, WideActivity.class);

                startActivity(intentwd);

            }
        });

        bt11 = (ImageButton) findViewById(R.id.imageButton18);

        bt11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentwd = new Intent(ExerActivity.this, WideActivity.class);

                startActivity(intentwd);

            }
        });
        bt12 = (ImageButton) findViewById(R.id.imageButton17);

        bt12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentwd = new Intent(ExerActivity.this, WideActivity.class);

                startActivity(intentwd);

            }
        });

        bt13 = (ImageButton) findViewById(R.id.imageButton16);

        bt13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentwd = new Intent(ExerActivity.this, WideActivity.class);

                startActivity(intentwd);

            }
        });




    }
}
