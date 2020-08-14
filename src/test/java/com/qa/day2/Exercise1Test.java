package com.qa.day2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise1Test {

    @Test
    public void testSum(){
         assertEquals(6, Exercise1.sum(4,2));
    }
    @Test
    public void testMultiply(){
        assertEquals(8, Exercise1.multiply(4,2));
    }

    @Test
    public void testSubtract(){
        assertEquals(2, Exercise1.subtract(4,2));
    }
    @Test
    public void testDivide1(){
        assertEquals(2.5, Exercise1.divide(5,2), 2.5);
    }
    @Test
    public void testDivide2(){
        assertEquals(0, Exercise1.divide(1,2), 0);
    }

}



