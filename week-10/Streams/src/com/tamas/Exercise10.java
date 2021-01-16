package com.tamas;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercise10 {

    public static void main(String[] args) {
        ArrayList<Fox> foxList = new ArrayList<>();
        foxList.add(new Fox("RedFox", "red", 8));
        foxList.add(new Fox("GreenFox", "green", 10));
        foxList.add(new Fox("BlueFox", "blue", 4));
        foxList.add(new Fox("GreenFox2", "green", 1));
        foxList.add(new Fox("PinkFox", "pink", 3));

        System.out.println(findFoxByColour("green", foxList));
        System.out.println(findFoxByColourAndUnderAge("green", 5, foxList));
        System.out.println(occurrencesByColor(foxList));
    }

    private static List<Fox> findFoxByColour(String colour, List<Fox> list) {
        return list.stream().filter(fox -> fox.getColour().equals(colour)).collect(Collectors.toList());
    }

    private static List<Fox> findFoxByColourAndUnderAge(String colour, int age, List<Fox> list) {
        return findFoxByColour(colour, list).stream().filter(fox -> fox.getAge() < age).collect(Collectors.toList());
    }

    private static Map<String, Long> occurrencesByColor(List<Fox> list) {
        return list.stream().collect(Collectors.groupingBy(Fox::getColour, Collectors.counting()));
    }

    private static class Fox {

        private String name;
        private String colour;
        private int age;

        public Fox(String name, String colour, int age) {
            this.name = name;
            this.colour = colour;
            this.age = age;
        }

        public String getColour() {
            return colour;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Fox{" +
                    "name='" + name + '\'' +
                    ", colour='" + colour + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}