package com.codewithme;

import java.util.Locale;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 0;
        while (i < 1) {
            System.out.println("Hello Bhai Log");
            i++;
        }

        Scanner scan = new Scanner(System.in);
        String Input = "";
//        while (!Input.equals("quit")) {
//            System.out.print("Input : ");
//            Input = scan.next().toLowerCase();
//            if(!Input.equals("quit"))
//            System.out.println(Input);


        // do while loop it check condition al last
//        do {
//            System.out.print("Input : ");
//            Input = scan.next().toLowerCase();
//            System.out.println(Input);
//
//        }while(!Input.equals("start"));

        //professional code with break and continue
        while (true) {
            System.out.print("Input : ");
            Input = scan.next().toLowerCase();
            if (!Input.equals("pass"))
                continue;
            if (!Input.equals("quit"))
                break;
            System.out.println(Input);
        }
    }
}