package com.tamas;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void checkAnagramShouldBeTrue() {
        Assert.assertTrue(Main.checkAnagram("New York Times", "monkeys write"));
        Assert.assertTrue(Main.checkAnagram("funeral", "real fun"));
        Assert.assertTrue(Main.checkAnagram("adultery", "true lady"));
    }

    @Test
    public void checkAnagramShouldBeFalse() {
        Assert.assertFalse(Main.checkAnagram("apple", "りんご"));
        Assert.assertFalse(Main.checkAnagram("???", "あなたは本当にこれをグーグル翻訳にコピーしました"));
    }
}