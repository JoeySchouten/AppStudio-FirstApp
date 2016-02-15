package com.example.joeys_000.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.TextView;


public class AdditiveRoller extends AppCompatActivity {

    private TextView dieResult2;
    private NumberPicker numpick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dice_roller_second);

        dieResult2 = (TextView) findViewById(R.id.dieResult2View);
        numpick = (NumberPicker) findViewById(R.id.numberPicker2);
        numpick.setMaxValue(120);
        numpick.setMinValue(1);
        numpick.setValue(1);

        Intent dieResult = getIntent();
        String oldResult = dieResult.getExtras().getString("result");
        dieResult2.setText(oldResult);
            }

    public void onD4Click(View view) {
        Dice.addRoll(numpick.getValue(), 4, dieResult2);
    }

    public void onD6Click(View view) {
        Dice.addRoll(numpick.getValue(), 6, dieResult2);
    }

    public void onD8Click(View view) {
        Dice.addRoll(numpick.getValue(), 8, dieResult2);
    }

    public void onD10Click(View view) {
        Dice.addRoll(numpick.getValue(), 10, dieResult2);
    }

    public void onD12Click(View view) {
        Dice.addRoll(numpick.getValue(), 12, dieResult2);
    }

    public void onD20Click(View view) {
        Dice.addRoll(numpick.getValue(), 20, dieResult2);
    }

    public void onD100Click(View view) {
        Dice.addRoll(numpick.getValue(), 100, dieResult2);
    }

    public void onACClick(View view) {
        dieResult2.setText("0");
    }

    public void onSingClick(View view) {
        Intent goToSingle = new Intent();
        final int result = 1;
        String dres = String.valueOf(dieResult2.getText());
        goToSingle.putExtra("result", dres);
        setResult(RESULT_OK, goToSingle);
        finish();
    }
}
