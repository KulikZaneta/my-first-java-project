package com.codefirstgirls.week1.session3;

public class Main {
    public static void main(String[] args) {
        Student studentA = new Student("Alice");
        Student studentB = new Student("Bob");
        Student studentC = new Student("Barbie");

        System.out.println(studentA.studentName);
        System.out.println(studentB.studentName);
        System.out.println(studentC.studentName);


        Fish fish = new Fish("Fish", 2);
        fish.printInfo();
        fish.makeFishSound();


        Fish randomFish = FishUtility.makeRandomFish();
        randomFish.makeFishSound();


        Exercise5.checkAge("Alice", 3);
        Exercise5.checkAge("Bob", 10);
        Exercise5.checkAge("John", 20);


    }

}

