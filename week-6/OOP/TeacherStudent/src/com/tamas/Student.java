package com.tamas;

public class Student {

    public void learn() {
        System.out.println("Student is learning.");
    }

    public void question(Teacher teacher) {
        System.out.println("Student asking a question.");
        teacher.answer();
    }
}
