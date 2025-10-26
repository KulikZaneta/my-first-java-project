package com.codefirstgirls.week1.session3;

public class Fish {

    private final String name;

    private final int age;

    private final String type = "pet";


    public Fish(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Type: " + type);
    }

    public void makeFishSound() {
        System.out.println(name + " goes blub blub!");
    }

}

