package com.qa.day2;

import org.junit.Test;


import static com.qa.day2.Exercise1.sum;
import static org.junit.Assert.assertEquals;

public class Exercise1Test {
    @Test
    public void testSum(){
         assertEquals(6, Exercise1.sum(4,2));

    }


}
