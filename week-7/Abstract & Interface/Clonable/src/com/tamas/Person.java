package com.tamas;

public abstract class Person {
    protected String name;
    protected int age;
    protected String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person() {
        this("Jane Doe", 30, "female");
    }

    public void introduce() {
        System.out.println("Hi, I'm " + this.name + ", a " + this.age + " year old " + this.gender + ".");
    }

    public String getGoal() {
        String goal = "My goal is: Live for the moment!";
        System.out.println(goal);
        return goal;
    }

    public abstract Person clone();
}