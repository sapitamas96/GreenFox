package com.tamas;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void name() {
        Assert.assertEquals(8, Main.fibonacci(6));
        Assert.assertEquals(34, Main.fibonacci(9));
        Assert.assertEquals(144, Main.fibonacci(12));
    }
}