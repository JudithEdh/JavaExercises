package com.qa.day3;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercisesArrayLists {

    public static List<String> music = new ArrayList<>();

    public static void main(String[]args) {
        music.add("song1");
        music.add("song2");
        music.add("song3");
        music.add("song4");
        System.out.println(music);
        for(int i=0; i<music.size(); i++){
            System.out.println(music.get(i));
        }
        music.set(2,"song2 new");
        System.out.println(music);
        music.remove(1);
        System.out.println(music);
        music.add("song5");
        music.add("song6");
        music.add("song7");
        music.add("song8");
        System.out.println(music);


    }
}
