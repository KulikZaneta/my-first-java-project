package com.codefirstgirls.week1.session2;

import java.util.Random;

public class Excerise5 {
    public static void run() {
        Random random = new Random();
        int min = 1;
        int max = 10;
        int randomInt = random.nextInt(max - min) + min;

        String output;

        if (randomInt % 2 == 0) {
            output = "even";
        } else {
            output = "odd";
        }

        System.out.println("Random number: " + randomInt);
        System.out.println("This number is " + output);
    }
}

