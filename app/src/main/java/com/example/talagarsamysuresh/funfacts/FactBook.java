package com.example.talagarsamysuresh.funfacts;

import java.util.Random;

/**
 * Created by T Alagarsamy Suresh on 23/7/2016.
 */
public class FactBook {

    private String[] mfacts = {"Ants stretch when they wake up in the morning", "Ostriches can run faster than horses",
            "Olympics are good to watch", "India is a Secular Country", "I born in India", "Born to win"};

    public String getFact(){

        String fact = "";
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mfacts.length);
        fact = mfacts[randomNumber];
        //fact=randomNumber + "";

        return fact;
    }
}



