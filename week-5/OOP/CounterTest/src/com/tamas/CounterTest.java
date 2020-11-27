package com.tamas;

import org.junit.jupiter.api.Test;
import org.w3c.dom.css.Counter;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    Counter counter = new Counter();

    @Test
    void addMore() {
        counter.add(5);
        assertEquals(5, counter.get());
    }

    @Test
    void addOne() {
        counter.add();
        assertEquals(1, counter.get());
    }

    @Test
    void getZero() {
        assertEquals(0, counter.get());
    }

    @Test
    void getInit() {
        Counter c = new Counter(7);
        assertEquals(7, c.get());
    }

    @Test
    void resetToZero() {
        counter.add();
        counter.reset();
        assertEquals(0, counter.get());
    }

    @Test
    void resetToInit() {
        Counter c = new Counter(7);
        c.add(5);
        c.reset();
        assertEquals(7, c.get());
    }
}