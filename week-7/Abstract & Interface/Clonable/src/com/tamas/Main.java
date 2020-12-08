package com.tamas;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList();
        Student john = new Student("John Doe", 20, "male", "BME");
        people.add(john);
        Person johnTheClone = john.clone();
        people.add(johnTheClone);
        john.age = 21;


        for(Person person : people) {
            person.introduce();
            person.getGoal();
        }



    }
}
