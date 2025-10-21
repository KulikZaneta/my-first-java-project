package com.codefirstgirls.week1.session1;

public class Exercise4 {
    public static void run() {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Primitive array: ");
        for (int num : numbers) {
            System.out.println(num);
        }

        String[] names = {"Alice", "Bob", "Charlie"};
        System.out.println("Non-primitive array: ");
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void instructorDemo() {
        String nonPrimitiveVariable = "hello";
        String edited = nonPrimitiveVariable.toUpperCase();

        System.out.println(nonPrimitiveVariable);
        System.out.println(edited);

        String nonPrimitiveVariableWithNoValue = new String();
        nonPrimitiveVariableWithNoValue = "hello again";
        System.out.println(nonPrimitiveVariableWithNoValue);

    }
}

