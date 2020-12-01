package com.tamas;

public class Teacher {

    public void answer() {
        System.out.println("Answering a question.");
    }

    public void teach(Student student) {
        System.out.println("Teaching.");
        student.learn();
    }
}
