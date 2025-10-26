package com.codefirstgirls.week1.session3;

import java.util.Random;

public class FishUtility {
    private static final String[] names = {"Goldie", "Bubbles", "Finny", "Splash"};
    private static final int[] ages = {1, 2, 3, 4, 5};


    public static Fish makeRandomFish() {
        Random random = new Random();
        String randomName = names[random.nextInt(names.length)];
        int randomAge = ages[random.nextInt(ages.length)];
        return new Fish(randomName, randomAge);
    }
}

