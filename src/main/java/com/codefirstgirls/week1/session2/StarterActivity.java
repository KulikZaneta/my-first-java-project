package com.codefirstgirls.week1.session2;

import java.util.HashMap;

public class StarterActivity {
    public static void run() {
        String[] fruits = {"apple", "banana", "cherry", "orange", "kiwi"};

        int n = 2;
        String chosenFruit = fruits[n];
        System.out.println("The element at index " + n + " is: " + chosenFruit);


        HashMap<String, String> animals = new HashMap<>();
        animals.put("dog", "Mary");
        animals.put("cat", "Kate");
        animals.put("parrot", "Polly");

        System.out.println("Animals: " + animals);

        String dogName = animals.get("dog");
        System.out.println("The dog's name is: " + dogName);

    }
}

