package com.github.inposa.jdr.utils;

public class Utils {
    public static int getRandomNumber(int min,int max){
        return (int) ((Math.random() * (max - min)) + min);
    }
}
