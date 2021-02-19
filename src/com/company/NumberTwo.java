package com.company;

import java.util.Random;

public class NumberTwo {
    public static void main(String[] args) {
        int a = 0;
        int b = 1_000_000;
        int c = b-a;
        Random random = new Random();
        int i = random.nextInt(c+1);
        System.out.println(i);
        if(i%10==0){
            System.out.println(i/10);
        }
        else {
            i = i - i%10;
            i = i/10;
            System.out.println(i);
        }
    }
}
