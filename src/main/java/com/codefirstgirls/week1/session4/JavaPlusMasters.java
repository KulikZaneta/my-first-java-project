package com.codefirstgirls.week1.session4;

public class JavaPlusMasters implements CfgClass {

    @Override
    public void greetStudent(String studentName) {
        System.out.println("Hello " + studentName + "! Welcome to the JavaPlusMasters course!");
    }

    @Override
    public void notifyStudent(String studentName, String message) {
        System.out.println("Hello " + studentName + ", " + message);
    }
}

