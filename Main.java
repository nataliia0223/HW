package com.Main;

import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the brick edges: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println("Enter the length of the hole`s sides: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        Brick brick = new Brick(a, b, c);
        brick.Hole(x, y);
        brick.fitHole();
    }
}
