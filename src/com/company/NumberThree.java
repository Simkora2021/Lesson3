package com.company;

import java.util.Random;

public class NumberThree {
    public static void main(String[] args) {
        int aa = 10;
        int b = 100;
        int c = b-aa;
        Random random = new Random();
        int i = random.nextInt(c);
        i=i+aa;
        System.out.println(i);
        int a = i%10;
        i = i-a;
        i = i/10;
        System.out.println(i);
    }
}
