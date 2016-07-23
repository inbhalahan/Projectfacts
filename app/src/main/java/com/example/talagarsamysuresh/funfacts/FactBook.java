package com.example.talagarsamysuresh.funfacts;

import java.util.Random;

/**
 * Created by T Alagarsamy Suresh on 23/7/2016.
 */
public class FactBook {
    public String getFact(){
        String[] facts = {"Ants stretch when they wake up in the morning", "Ostriches can run faster than horses",
                "Olympics are good to watch", "India is a Secular Country", "I born in India", "Born to win"};
        String fact = "";
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);
        fact = facts[randomNumber];

        return fact;
    }
}
