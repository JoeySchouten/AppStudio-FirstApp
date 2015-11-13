package com.example.joeys_000.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.NumberPicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView die_result;
    private NumberPicker numpick;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dice_roller_main);

        die_result = (TextView) findViewById(R.id.die_result);
        numpick = (NumberPicker) findViewById(R.id.numberPicker);
        numpick.setMaxValue(120);
        numpick.setMinValue(1);
        numpick.setValue(1);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    //d8button.setBackground(getResources().getDrawable(R.drawable.button_dark));
    public void onAddClick (View view) {
        Intent goToAdditive = new Intent(this, AdditiveRoller.class);
        String dres = String.valueOf(die_result.getText());
        goToAdditive.putExtra("result", dres);
        startActivityForResult(goToAdditive, 1);
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


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        String addResult = data.getStringExtra("result");
        die_result.setText(addResult);
    }
}
