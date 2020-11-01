package com.Main;
public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(12);
        double rad = circle.getRadius();
        circle.radArea(rad);

        Information info = new Information("Nataliia", "Radekhiv");
        System.out.println(info.getName() + " lives in " + info.getAdress() + "!");

        Count count = new Count();
        count.minutesPerTalk();

    }
}
