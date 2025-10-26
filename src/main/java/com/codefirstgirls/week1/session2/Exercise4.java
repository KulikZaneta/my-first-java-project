package com.codefirstgirls.week1.session2;

public class Exercise4 {
    public static void run() {
        int[] myNums = {1, 2, 3, 4, 5};

        for (int num : myNums) {
            if (num % 2 == 0) {
                System.out.println("even number!");
            } else {
                System.out.println("not even...");
            }
        }
    }
}

