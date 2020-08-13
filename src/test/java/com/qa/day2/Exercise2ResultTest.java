package com.qa.day2;

import org.junit.Assert;
import org.junit.Test;

public class Exercise2ResultTest {

    @Test
    public void testMyResult(){
        Exercise2Result.Result myResult= new Exercise2Result.Result(120,150,140);
        double result=myResult.gpa();
        Assert.assertEquals(91, result, 91);
    }

    @Test
    public void testFailGrade(){

    }
}
