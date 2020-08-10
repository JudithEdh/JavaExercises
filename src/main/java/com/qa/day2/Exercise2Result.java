package com.qa.day2;

public class Exercise2Result {
    public static class Result{
        private int physics, chemistry, biology;

        public Result(int physics, int chemistry, int biology) {
            this.physics = physics;
            this.chemistry = chemistry;
            this.biology = biology;
        }
        public void display(){
            int total=physics+chemistry+biology;
            System.out.println("Your Physics result is "+ physics);
            System.out.println("Your Chemistry result is "+ chemistry);
            System.out.println("Your Biology result is "+ biology);
            System.out.println("Your total is "+ total);

        }
        public void gpa(){
            double percentage=100*(physics+chemistry+biology)/450;
            if((percentage>= 60)&&(physics>=90) &&(biology>=90)&&(chemistry>=90)){
                System.out.println("Your percentage is " + percentage + " % (pass)");
            }else{
                System.out.println("Your percentage is " + percentage + " % (fail)");
            }
        }

    }
    public static void main(String[]args){
        Result myResult= new Result(120,150,140);
        myResult.display();
        myResult.gpa();


    };
}
