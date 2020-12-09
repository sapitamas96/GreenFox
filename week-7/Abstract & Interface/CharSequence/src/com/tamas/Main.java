package com.tamas;

public class Main {

    public static void main(String[] args) {
        Girts girts = new Girts("example");
        System.out.println(girts.charAt(1));
        System.out.println(girts.charAt(2));

        ShiftedCharSequence shifter = new ShiftedCharSequence("example", 2);
        System.out.println(shifter.charAt(0));
        System.out.println(shifter.charAt(3));
    }
}
