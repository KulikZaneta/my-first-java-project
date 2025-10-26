package com.codefirstgirls.week1.session4;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int sum = 15;

        boolean result = CalculatorUtil.equalsSum(sum, a, b);
        System.out.println("Does " + a + " + " + b + " equal " + sum + "? " + result);



        CfgClass pythonClass = new PythonKickstarter();
        pythonClass.greetStudent("Alice");
        pythonClass.notifyStudent("Alice", "Your first project is due tomorrow!");

        CfgClass javaClass = new JavaPlusMasters();
        javaClass.greetStudent("Bob");
        javaClass.notifyStudent("Bob", "Don't forget to review design patterns!");


        DayOfWeek today = DayOfWeek.WEDNESDAY;

        switch (today) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY ->
                    System.out.println("Enjoy work!");
            case SATURDAY, SUNDAY ->
                    System.out.println("Have a nice rest!");
        }
    }
}


