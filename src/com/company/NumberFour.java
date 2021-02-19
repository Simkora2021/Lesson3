package com.company;

import java.util.Random;

public class NumberFour {
    public static void main(String[] args) {
        int a = 100;
        int b = 1000;
        int c = b-a;
        Random random = new Random();
        int i = random.nextInt(c);
        i = i+a;

        System.out.println(i);
        int cc =i%10;
        System.out.println(cc);
        int xx =i%100;
        xx = xx-cc;
      // xx = xx/10;
        System.out.println(xx);
    }
}
