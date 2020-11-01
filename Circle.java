package com.Main;


public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
    public static void radArea(double rad){
        double perimeter = 2 * rad * Math.PI;
        double area = rad * rad * Math.PI;
        System.out.println("1) Perimeter of the flower bed = " + perimeter + "\n   Area of the flower bed = " + area);
    }
}
