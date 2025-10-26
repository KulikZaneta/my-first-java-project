package com.codefirstgirls.week1.session2;

public class Exercise7 {
    public static void run() {
        int num1 = 10;
        int num2 = 5;
        String operation = "+";

        Integer result = getInteger(operation, num1, num2);
        if (result == null) return;
        System.out.println("Result: " + result);
    }

    private static Integer getInteger(String operation, int num1, int num2) {
        int result;
        if (operation.equals("+")) {
            result = num1 + num2;
        } else if (operation.equals("-")) {
            result = num1 - num2;
        } else {
            System.out.println("Invalid operation!");
            return null;
        }
        return result;
    }
}



