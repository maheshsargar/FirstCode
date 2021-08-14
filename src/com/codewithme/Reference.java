package com.codewithme;

import java.awt.*;

public class Reference {
        // example of primitive and reference type
        public static void main(String[] args) {
            // Reference type
            Point point1 = new Point(1, 2);
            Point point2 = point1;
            point1.x = 3;
            System.out.println(point2);
    }
}
