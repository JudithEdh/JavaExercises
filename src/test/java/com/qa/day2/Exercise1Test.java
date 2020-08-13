package com.qa.day2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise1Test {

    @Test
    public void testSum(){
         assertEquals(6, Exercise1.sum(4,2));
    }
    @Test
    public void testDivide(){
        assertEquals(2.5, Exercise1.divide(5,2), 2.5);
    }
    }



