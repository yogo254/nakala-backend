package com.yogo.nakalabackend.services;

import java.util.Random;

public class UUID {
    public static String getRandomString() {
        String randomString = "";
        final String alphabet = "0123456789ABCDE";
        final int N = alphabet.length();

        Random r = new Random();

        for (int i = 0; i < 50; i++) {
            randomString += String.valueOf(alphabet.charAt(r.nextInt(N)));
        }

        return randomString;
    }

}