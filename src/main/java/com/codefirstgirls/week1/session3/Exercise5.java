package com.codefirstgirls.week1.session3;

public class Exercise5 {

    public static String checkAge(String name, int age) {
        if (age >= 0 && age <= 4) {
            System.out.println(name + " is yet to start school");
            return "INFANT";
        } else if (age >= 5 && age <= 18) {
            System.out.println(name + " is in school");
            return "CHILD";
        } else {
            System.out.println(name + " is an adult");
            return "ADULT";
        }
    }
}

