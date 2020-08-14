package com.qa.day2;

public class Exercise2Result {
    public static class Result{
        private int physics, chemistry, biology;

        public Result(int physics, int chemistry, int biology) {
            this.physics = physics;
            this.chemistry = chemistry;
            this.biology = biology;
        }
        public int display(){
            int total=physics+chemistry+biology;
            System.out.println("Your Physics result is "+ physics);
            System.out.println("Your Chemistry result is "+ chemistry);
            System.out.println("Your Biology result is "+ biology);
            System.out.println("Your total is "+ total);
            return 1;

        }
        public double gpa(){

            float percentage=100*(physics+chemistry+biology)/450;
            if((percentage>= 60)&&(physics>=90) &&(biology>=90)&&(chemistry>=90)){

                System.out.println("Your percentage is " + percentage + " % (pass)");
                return percentage;

            }else{

                System.out.println("Your percentage is " + percentage + " % (fail)");
                return percentage;
            }


        }

    }
    public static void main(String[]args){
        Result myResult3= new Result(70,70,70);
        int ok= myResult3.display();
        myResult3.gpa();



    }
}
