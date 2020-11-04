package com.Main;

public class Brick {
    private double a;
    private double b;
    private double c;
    private double x;
    private double y;

    public Brick(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void Hole(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void fitHole() {
        try {
            if (a <= 0 || b <= 0 || c <= 0) {
                System.out.println("These values are not possible");
            } else {
                if ((x < a || y < a) && (x < b || y < b) && (x < c || y < c) || (x <= 0 || y <= 0)) {
                    System.out.println("You can`t move up the brick in this hole!!!");
                } else {
                    System.out.println("You can move up the brick in this hole!!!");
                }
            }
        }catch (Exception e){
            System.out.println("Bug!");
        }
    }
}
