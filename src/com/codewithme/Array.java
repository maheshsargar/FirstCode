package com.codewithme;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        //int[5] = array size
        int[] numbers = new int[5];
        int[] num = {2, 4, 10, 6, 8,};
        System.out.println(num.length);

        //it will sort array
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        //added data to index value
        numbers [0] = 1;
        numbers [1] = 2;
        numbers [2] = 9;
        numbers [3] = 4;
        numbers [4] = 5;

        // it will print address of the object in the memory
        System.out.println(numbers.length);
        Arrays.sort(numbers);

        // it will print data of the index numbers
        System.out.println(Arrays.toString(numbers));
    }
}
