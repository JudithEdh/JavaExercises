package com.qa.day2;

public class Exercises {

    public static void main(String[]args){
        int first=2;
        int second=4;
        int sum=sum(first,second);
        int subtract=subtract(first,second);
        int divide=divide(first, second);
        int multiply=multiply(first,second);
        System.out.println(first +" + "+ second+" = "+ sum);
        System.out.println(first +" - "+ second+" = "+ subtract);
        System.out.println(first +" * "+ second+" = "+ multiply);
        System.out.println(first +" / "+ second+" = "+ divide);

    }
    public static int sum(int firstNumber, int secondNumber ){
        return (firstNumber+secondNumber);
    }
    public static int subtract(int firstNumber, int secondNumber ){
        return (firstNumber-secondNumber);
    }
    public static int multiply(int firstNumber, int secondNumber ){
        return (firstNumber*secondNumber);
    }
    public static int divide(int firstNumber, int secondNumber ){
        return (firstNumber/secondNumber);
    }
};


