package com.qa.day2;

public class Exercise7Taxes {

static int percentage(int salary){
    int percentage=0;
   if(salary < 20000 && salary>=15000){
       percentage=10;
   }else if(salary < 30000 && salary>=20000){
       percentage=15;
   }else if(salary < 45000 && salary>=30000){
       percentage=20;
   }else if (salary>=45000){
       percentage=25;}
return percentage;
}
    static double tax(int salary, int percentage){
    double tax;

    return tax=percentage*salary/100;
    }


    public static void main(String[]args){
    int salary=45000;
    int percentage=percentage(salary);
    System.out.println(tax(salary,percentage));
    }
}
