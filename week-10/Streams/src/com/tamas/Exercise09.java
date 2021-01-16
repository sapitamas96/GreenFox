package com.tamas;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise09 {

    public static void main(String[] args) {
        String text = "This is a very looooong string. Not that looooong but still not short";

        System.out.println(numberOfChars(text));
    }

    private static Map<String, Long> numberOfChars (String input) {
        return Stream.of(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
