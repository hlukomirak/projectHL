package com.example.hare.projecthl;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WideActivity extends AppCompatActivity {

    private int counter = 0;
    private TextView counterTextView;
    private TextView mTextField;
    private TextView info;
    private Button bt;
    private Button bt2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_push);
        bt = (Button) findViewById(R.id.button4);
        bt2 = (Button) findViewById(R.id.button);
        bt.setVisibility(View.INVISIBLE);

        info = (TextView) findViewById(R.id.textView);
        counterTextView = (TextView) findViewById(R.id.textView3);
        mTextField = (TextView) findViewById(R.id.textView2);


    }

    public void ButtonClicked(View view) {
        counter++;
        counterTextView.setText(String.valueOf(counter));

    }


    public void CounterClicked(View view) throws InterruptedException {

        bt.setVisibility(View.VISIBLE);
        bt2.setVisibility(View.INVISIBLE);
        info.setVisibility(View.INVISIBLE);

        Thread.sleep(2200);

        final CountDownTimer start = new CountDownTimer(30000, 1000) {


            public void onTick(long millisUntilFinished) {
                mTextField.setText("TIME : " + millisUntilFinished / 1000);
            }

            public void onFinish() {
                counterTextView.setText("0");
                mTextField.setText("done!");

            }
        }.start();


    }
}