package com.tamas;

public class Counter {

    private int counter;

    public Counter() {}

    public Counter(int number) {
        this.counter = number;
    }

    public void add(int number) {
        this.counter += number;
    }

    public void add() {
        this.counter++;
    }

    public int get() {
        return counter;
    }

    public void reset() {
        this.counter = 0;
    }
}
