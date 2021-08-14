package com.codewithme;

public class ForEachLoop {
    public static void main(String[] args) {
        String[] fruits = {"apple", "candyapple","roseapple"};
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);

        }
        // for each loop
        for (String fruit: fruits
             ) {
            System.out.println(fruit);
            
        }
    }
}
