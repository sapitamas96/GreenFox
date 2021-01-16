package com.tamas;

import java.util.stream.Collectors;

public class Exercise06 {

    public static void main(String[] args) {
        String text = "sdAbcaLasMsaAa";

        System.out.println(
        text.chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isUpperCase)
                .map(Object::toString)
                .collect(Collectors.joining())
        );
    }
}
