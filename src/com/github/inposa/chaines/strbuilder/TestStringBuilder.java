package com.github.inposa.chaines.strbuilder;

public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("");
        String str = "";

        long start = System.currentTimeMillis();

        /*for (int i = 0; i < 100_000; i++) {
            str += i;
        }*/
        for (int i = 0; i < 100_000; i++) {
            stringBuilder.append(i);
        }

        long end = System.currentTimeMillis();

        // ~ 4000ms pour le += et 15ms pour le stringBuilder
        System.out.println("Time : " + (end - start) + "ms");

    }
}
