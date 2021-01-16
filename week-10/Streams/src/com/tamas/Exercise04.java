package com.tamas;

import java.util.Arrays;
import java.util.List;

public class Exercise04 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        System.out.println(
        numbers.stream()
                .filter(i -> i % 2 != 0)
                .mapToInt(Integer::intValue)
                .peek(System.out::println)
                .average()
                .getAsDouble()
        );
    }
}
