package com.pluralsight;

public class Dice {

    public int roll() {
        int randomNumber = (int) (Math.random() * (6 - 1 + 1)) + 1;
        return randomNumber;
    }
}