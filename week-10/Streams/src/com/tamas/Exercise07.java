package com.tamas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise07 {

    public static void main(String[] args) {
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");

        final String LETTER = "A";

        System.out.println(
        cities.stream()
                .filter(s -> s.startsWith(LETTER)).collect(Collectors.toList())
        );
    }
}
