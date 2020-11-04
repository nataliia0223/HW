package com.Main;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main (String[]args) {
        double a = 0, b = 0, c = 0;
        double x = 0, y = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the brick edges: ");
        try {
             a = sc.nextDouble();
             b = sc.nextDouble();
             c = sc.nextDouble();
        System.out.println("Enter the length of the hole`s sides: ");
         x = sc.nextDouble();
         y = sc.nextDouble();
        }catch (InputMismatchException e){
            System.out.println("Not a number!");
        }

        Brick brick = new Brick(a, b, c);
        if(brick == null){
            throw new NullPointerException("Object == null");
        }
        brick.Hole(x, y);
        brick.fitHole();
    }
}
