package com.tamas;

public class Student extends Person {
    private String previousOrganization;
    private int skippedDays;

    public Student() {
        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;
    }

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }
    private Student(String name, int age, String gender, String previousOrganization, int skippedDays) {
        this(name, age, gender, previousOrganization);
        this.skippedDays = skippedDays;
    }

    public String getGoal() {
        String goal = "Be a junior software developer.";
        return goal;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + this.name + ", a " + this.age + " year old " + this.gender + " from " + this.previousOrganization + " who skipped " + this.skippedDays + " days from the course already.");
    }

    public void skipDays(int numberOfDays) {
        this.skippedDays += numberOfDays;
    }

    @Override
    public Person clone() {
        return new Student(name, age, gender, previousOrganization, skippedDays);
    }
}