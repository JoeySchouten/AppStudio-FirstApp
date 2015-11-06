package com.example.joeys_000.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.NumberPicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageButton d4button;
    private ImageButton d6button;
    private Button d8button;
    private Button d10button;
    private Button d12button;
    private ImageButton d20button;
    private Button d100button;
    private TextView die_result;
    private NumberPicker numpick;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dice_roller_main);

        d4button = (ImageButton) findViewById(R.id.d4button);
        d6button = (ImageButton) findViewById(R.id.d6button);
        d8button = (Button) findViewById(R.id.d8button);
        d10button = (Button) findViewById(R.id.d10button);
        d12button = (Button) findViewById(R.id.d12button);
        d20button = (ImageButton) findViewById(R.id.d20button);
        d100button = (Button) findViewById(R.id.d100button);
        die_result = (TextView) findViewById(R.id.die_result);
        numpick = (NumberPicker) findViewById(R.id.numberPicker);
        numpick.setMaxValue(120);
        numpick.setMinValue(1);
        numpick.setValue(1);
    }

    public void onD4Click(View view) {
        die_result.setText(Integer.toString(Dice.roll(numpick.getValue(),4)));
    }

    public void onD6Click(View view) {
        die_result.setText(Integer.toString(Dice.roll(numpick.getValue(), 6)));
    }

    public void onD8Click(View view) {
        die_result.setText(Integer.toString(Dice.roll(numpick.getValue(),8)));
    }

    public void onD10Click(View view) {
        die_result.setText(Integer.toString(Dice.roll(numpick.getValue(),10)));
    }

    public void onD12Click(View view) {
        die_result.setText(Integer.toString(Dice.roll(numpick.getValue(),12)));
    }

    public void onD20Click(View view) {
        die_result.setText(Integer.toString(Dice.roll(numpick.getValue(),20)));
    }

    public void onD100Click(View view) {
        die_result.setText(Integer.toString(Dice.roll(numpick.getValue(),100)));
    }

    public void onBoolD6Click(View view) {
        die_result.setText("Sx" + Integer.toString(Dice.boolDiceRoll(numpick.getValue())));
    }

}
