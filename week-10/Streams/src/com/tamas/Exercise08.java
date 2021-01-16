package com.tamas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class Exercise08 {

    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>(Arrays.asList('t', 'r', 'e', 'e'));

        System.out.println(
        list.stream()
                .map(Objects::toString)
                .reduce("apple", (s1, s2) -> s1 + s2));
    }
}
