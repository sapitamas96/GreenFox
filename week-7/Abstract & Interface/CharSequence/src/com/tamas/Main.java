package com.tamas;

public class Main {

    public static void main(String[] args) {
        Gnirts gnirts = new Gnirts("example");
        System.out.println(gnirts.charAt(1));
        System.out.println(gnirts.charAt(2));

        ShiftedCharSequence shifter = new ShiftedCharSequence("example", 2);
        System.out.println(shifter.charAt(0));
        System.out.println(shifter.charAt(3));
    }
}
