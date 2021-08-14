package com.codewithme;

public class Casting {
    public static void main(String[] args) {
        //implicit casting it is automatic conversion like below
        // byte > short > int > long > float > double
        // in implicit casting there is a no chance for data loss
        short x = 1;
        int y =  x + 2;
        System.out.println(y);

        double a = 1.145;
        double b = a;
        System.out.println(b);

        //Explicit casting
        //data loss occur
        double m = 1.145;
        int s =  (int)m + 2;
        System.out.println(s);

        //we cannot cast string to number
        //so in this way we can convert string to any datatype
        String t = "1.45";
        float u = Float.parseFloat(t)   + 2;
        System.out.println(u);
    }


}
