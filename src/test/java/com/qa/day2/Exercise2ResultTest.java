package com.qa.day2;

import org.junit.Assert;
import org.junit.Test;

public class Exercise2ResultTest {

    @Test
    public void testMyResult() {
        Exercise2Result.Result myResult = new Exercise2Result.Result(120, 150, 140);
        double result = myResult.gpa();
        Assert.assertEquals(91, result, 91);
    }

    @Test
    public void testFailGrade() {
        Exercise2Result.Result myResult2 = new Exercise2Result.Result(70, 70, 70);
        double result2 = myResult2.gpa();
        Assert.assertEquals(46, result2, 46);

    }

    @Test
    public void testDisplay() {
        Exercise2Result.Result myResultDisplay = new Exercise2Result.Result(70, 70, 70);
        int testDisplay = myResultDisplay.display();
        Assert.assertEquals(1, testDisplay);
    }
}
