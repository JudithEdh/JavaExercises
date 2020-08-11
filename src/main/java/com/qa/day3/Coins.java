package com.qa.day3;

public class Coins {

    public static void main(String[]args) {
        float cost = 4.58f *100;
        float amount = 20f*100;
        float remaining = amount - cost;
        int notes10=0;
        int notes5=0;
        int notes2=0;
        int notes1=0;
        int notes050=0;
        int notes020=0;
        int notes010=0;
        int notes005=0;
        int notes002=0;
        int notes001=0;
        while (remaining != 0) {

            while(remaining>=10*100){
                notes10++;
                float a=10.00f*100;
                remaining=remaining-a;
            }
            while(remaining>=5*100){
                notes5++;
                float a= 5.00f*100;
                remaining=remaining-a;
            }
            while(remaining>=2*100){
                notes2++;
                float a=2.00f*100;
                remaining=remaining-a;
            }
            while(remaining>=1*100){
                notes1++;
                float a=1.00f*100;
                remaining=remaining-a;
            }
            while(remaining>=0.50*100){
                notes050++;
                remaining=remaining-0.50f*100;
            }
            while(remaining>=0.20*100){
                notes020++;
                remaining=remaining-0.20f*100;
            }
            while(remaining>=0.10*100){
                notes010++;
                remaining=remaining-0.10f*100;
            }
            while(remaining>=0.05*100){
                notes005++;
                remaining=remaining-0.05f*100;
            }
            while(remaining>=0.02*100){
                notes002++;
                remaining=remaining-0.02f*100;
            }
            while(remaining>=0.01*100){
                notes005++;
                remaining=remaining-0.01f*100;
            }
        }
        System.out.println(notes10+" £10 notes");
        System.out.println(notes5+" £5 notes");
        System.out.println(notes2+" £2 coins");
        System.out.println(notes1+" £1 coins");
        System.out.println(notes050+" £0.50 coins");
        System.out.println(notes020+" £0.20 coins");
        System.out.println(notes010+" £0.10 coins");
        System.out.println(notes005+" £0.05 coins");
        System.out.println(notes002+" £0.02 coins");
        System.out.println(notes001+" £0.01 coins");
    }
}
