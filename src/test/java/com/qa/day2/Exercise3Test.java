package com.qa.day2;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class Exercise3Test {

    @Test
    public void input() {
        Assert.assertEquals(Exercise3.input(2,2,true),4);
        Assert.assertEquals(Exercise3.input(2,2,false),4);

    }
}