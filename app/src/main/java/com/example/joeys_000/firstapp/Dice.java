package com.example.joeys_000.firstapp;

public class Dice {
    public static int roll(int amt, int size) {
        // random number gen taken from:
        // http://stackoverflow.com/questions/363681/generating-random-integers-in-a-range-with-java
        return (amt + (int) (Math.random() * (((size*amt) - amt) + 1)));
    }

    // rolls a 6-sided die and returns increases the amount of successes if 5 or 6
    public static int boolDiceRoll(int amt) {
        int success = 0;
        for (int i = 0; i < amt; i++) {
            if (Dice.roll(1, 6) > 4) {
                success++;
            }
        }
        return success;
    }
}
