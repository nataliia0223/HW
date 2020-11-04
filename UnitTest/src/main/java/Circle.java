public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
    public static int area(double rad){
        double area = rad * rad * Math.PI;
        System.out.println("Area of the flower bed = " + area);
        return (int) area;
    }
    public static int rad(double rad){
        double perimeter = 2 * rad * Math.PI;
        System.out.println(" Perimeter of the flower bed = " + perimeter );
        return (int) perimeter;
    }
}
