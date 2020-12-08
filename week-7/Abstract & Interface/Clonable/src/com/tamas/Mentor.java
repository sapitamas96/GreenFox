package com.tamas;

public class Mentor extends Person {

    enum Level {JUNIOR, INTERMEDIATE, SENIOR}

    protected Level level;

    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        switch (level.toLowerCase()) {
            case "junior": this.level = Level.JUNIOR; break;
            case "intermediate": this.level = Level.INTERMEDIATE; break;
            case "senior": this.level = Level.SENIOR; break;
        }

    }

    public Mentor() {
        super();
        this.level = Level.INTERMEDIATE;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + level + " mentor.");
    }

    @Override
    public String getGoal() {
        String goal = "Educate brilliant junior software developers.";
        System.out.println(goal);
        return goal;
    }

    @Override
    public Person clone() {
        return new Mentor(name, age, gender, level.toString());
    }
}

