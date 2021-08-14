package com.codewithme;

import java.util.Arrays;

public class MultiDimensionalArray {

    public static void main(String[] args) {

        //concept of constant
        // whenever you put final in front for variable
        // you cannot change it after that in any method
        // ex..
        // final float pi = 3.14F;
        //  pi = 1;



        //int [][] numbers = new int[row][column];
        int [][] numbers = new int[2][3];
        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[0][2] = 3;
        numbers[1][0] = 1;
        numbers[1][1] = 2;
        numbers[1][2] = 3;

        System.out.println(Arrays.deepToString(numbers));

        // curly brackets itself present a row
        int [][] num = {{1, 2,5},{1,2,6}};
        System.out.println(Arrays.deepToString(num));
        System.out.println(Arrays.toString(num));
    }

}
