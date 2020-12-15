package com.tamas;

public class Main {

    public static void main(String[] args) {
        System.out.println(fibonacci(12));
    }

    public static int fibonacci(int index) {
        if (index <= 1) return index;
        return fibonacci(index - 1) + fibonacci(index - 2);
    }
}
