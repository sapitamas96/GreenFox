package com.tamas;
import org.junit.Assert;
import org.junit.Test;

class CounterTest {
    Counter counter = new Counter();

    @Test
    void addMore() {
        counter.add(5);
        Assert.assertEquals(5, counter.get());
    }

    @Test
    void addOne() {
        counter.add();
        Assert.assertEquals(1, counter.get());
    }

    @Test
    void getZero() {
        Assert.assertEquals(0, counter.get());
    }

    @Test
    void getInit() {
        Counter c = new Counter(7);
        Assert.assertEquals(7, c.get());
    }

    @Test
    void resetToZero() {
        counter.add();
        counter.reset();
        Assert.assertEquals(0, counter.get());
    }

    @Test
    void resetToInit() {
        Counter c = new Counter(7);
        c.add(5);
        c.reset();
        Assert.assertEquals(7, c.get());
    }

}