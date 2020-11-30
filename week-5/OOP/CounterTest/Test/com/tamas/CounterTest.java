package com.tamas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    Counter counter = new Counter();

    @Test
    void add() {
        counter.add(5);
        assertEquals(5, counter.get());
    }
}