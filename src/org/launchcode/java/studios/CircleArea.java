package org.launchcode.java.studios;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args){
        Double radius;
        Double area;
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Please enter a radius: ");
            radius = in.nextDouble();
        } while (radius<0);

        area = 3.14 * radius * radius;
        System.out.println("The area of a circle of radius " + radius + " is: " + area);

    }
}
