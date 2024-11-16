package com.bootcamp.demo_sb_calculator.model;
import java.util.Arrays;

public class Database {
    private static String[] strings = new String[] {"abc","def","ghi"};

    public static String getString(int index){
        return strings[index];
    }

    public static int size(){
        return strings.length;
    }

    public static String[] getStringsArray(){
        return strings;
    }


    public static String addString(String newString){
        String[] newArray = Arrays.copyOf(strings,strings.length+1);
        newArray[newArray.length-1] = newString;
        strings = newArray;
        return newString;
    }
}
