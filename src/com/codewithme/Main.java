package com.codewithme;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Primitive type
        float age = 24.24f;
        long viewsCount = 180_584_445_4547L;
        char letter = 'A';
        boolean isEligible = true;
        // Reference type
        Date time = new Date();



        System.out.print("Current time is  ");
        System.out.println(time);
        System.out.print("Your age is  ");
        System.out.println(age);
        System.out.println(viewsCount);
        System.out.println(letter);
        System.out.println(isEligible);
    }
}

