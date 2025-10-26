package com.codefirstgirls.week1.session4;

public class PythonKickstarter implements CfgClass {

    @Override
    public void greetStudent(String studentName) {
        System.out.println("Hello " + studentName + "! Welcome to the Python course!");
    }

    @Override
    public void notifyStudent(String studentName, String message) {
        System.out.println("Hello " + studentName + ", " + message);
    }
}

