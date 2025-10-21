package com.codefirstgirls.week1.session1;

public class Exercise2 {

    public static void performOperations(int a, int b) {
        System.out.println("a multiplied by b: " + (a * b));
        System.out.println("a plus b: " + (a + b));

        if (b != 0) {
            System.out.println("a divided by b: " + (a / b));
            System.out.println("a modulo b: " + (a % b));
        } else {
            System.out.println("Cannot divide by 0!");
        }
    }
}

