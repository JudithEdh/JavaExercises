package com.qa.day2;

import org.junit.Test;

import  org.junit.Assert;

public class Exercise5BlackJackTest {

    @Test
    public void play() {
        Assert.assertEquals(Exercise5BlackJack.play(21,1),21);
        Assert.assertEquals(Exercise5BlackJack.play(1,21),21);
        Assert.assertEquals(Exercise5BlackJack.play(22,22),0);
    }
}