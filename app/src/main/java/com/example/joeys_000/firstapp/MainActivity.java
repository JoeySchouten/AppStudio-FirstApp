package com.example.joeys_000.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button d4button;
    private ImageButton d6button;
    private Button d8button;
    private Button d10button;
    private Button d12button;
    private ImageButton d20button;
    private Button d100button;
    private TextView die_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        d4button = (Button) findViewById(R.id.d4button);
        d6button = (ImageButton) findViewById(R.id.d6button);
        d8button = (Button) findViewById(R.id.d8button);
        d10button = (Button) findViewById(R.id.d10button);
        d12button = (Button) findViewById(R.id.d12button);
        d20button = (ImageButton) findViewById(R.id.d20button);
        d100button = (Button) findViewById(R.id.d100button);
        die_result = (TextView) findViewById(R.id.die_result);
    }

    public void onD4Click(View view) {
        // random number gen taken from:
        // http://stackoverflow.com/questions/363681/generating-random-integers-in-a-range-with-java
       String result = Integer.toString(1 + (int) (Math.random() * ((4 - 1) + 1)));
        die_result.setText(result);
    }

    public void onD6Click(View view) {
        // random number gen taken from:
        // http://stackoverflow.com/questions/363681/generating-random-integers-in-a-range-with-java
        String result = Integer.toString(1 + (int) (Math.random() * ((6 - 1) + 1)));
        die_result.setText(result);
    }

    public void onD8Click(View view) {
        // random number gen taken from:
        // http://stackoverflow.com/questions/363681/generating-random-integers-in-a-range-with-java
        String result = Integer.toString(1 + (int) (Math.random() * ((8 - 1) + 1)));
        die_result.setText(result);
    }

    public void onD10Click(View view) {
        // random number gen taken from:
        // http://stackoverflow.com/questions/363681/generating-random-integers-in-a-range-with-java
        String result = Integer.toString(1 + (int) (Math.random() * ((10 - 1) + 1)));
        die_result.setText(result);
    }

    public void onD12Click(View view) {
        // random number gen taken from:
        // http://stackoverflow.com/questions/363681/generating-random-integers-in-a-range-with-java
        String result = Integer.toString(1 + (int) (Math.random() * ((12 - 1) + 1)));
        die_result.setText(result);
    }

    public void onD20Click(View view) {
        // random number gen taken from:
        // http://stackoverflow.com/questions/363681/generating-random-integers-in-a-range-with-java
        String result = Integer.toString(1 + (int) (Math.random() * ((20 - 1) + 1)));
        die_result.setText(result);
    }

    public void onD100Click(View view) {
        // random number gen taken from:
        // http://stackoverflow.com/questions/363681/generating-random-integers-in-a-range-with-java
        String result = Integer.toString(1 + (int) (Math.random() * ((100 - 1) + 1)));
        die_result.setText(result);
    }
}
