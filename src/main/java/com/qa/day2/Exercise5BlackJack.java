package com.qa.day2;

public class Exercise5BlackJack {

  public static int play(int a, int b){
      int closeA= 21-a;
      int closeB=21-b;

      if((closeA>= 0)&&(closeB>=0)){
          if(closeA>=closeB){
              return b;
          }else{
              return a;
          }
      }else{
          return 0;
      }
  }



    public static void main(String[]args){
        int result= play(24, 24);
        System.out.println(result);
    }


}
