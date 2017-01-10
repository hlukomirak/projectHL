package com.example.hare.projecthl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;

public class SplsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_spls);
        ImageView imgview = (ImageView) findViewById(R.id.sps);
        imgview.setScaleType(ImageView.ScaleType.FIT_XY);


        Thread myThread = new Thread() {
            @Override


            public void run() {

                try {
                    sleep(6000);

                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);

                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


        };
        myThread.start();

    }
}
