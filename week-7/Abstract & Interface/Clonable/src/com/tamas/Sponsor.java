package com.tamas;

public class Sponsor extends Person {
    protected String company;
    protected int hiredStudents;

    public Sponsor() {
        this.company = "Google";
        this.hiredStudents = 0;
    }

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = 0;
    }

    private Sponsor(String name, int age, String gender, String company, int hiredStudents) {
        this(name, age, gender, company);
        this.hiredStudents = hiredStudents;
    }

    public void hire() {
        ++this.hiredStudents;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + this.name + ", a " + this.age + " year old " + this.gender + " who represents " + this.company + " and hired " + this.hiredStudents + " students so far.");
    }

    public String getGoal() {
        String goal = "Hire brilliant junior software developers.";
        System.out.println(goal);
        return goal;
    }

    @Override
    public Person clone() {
        return new Sponsor(name, age, gender, company, hiredStudents);
    }
}
