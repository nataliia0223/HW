package com.Main;

import java.util.Scanner;

public class Count {
    private int c1, t1;

    public  void minutesPerTalk(){
        int sum = 0;
        Scanner sc1 = new Scanner(System.in);
        for(int i = 1; i <= 3; i++) {
            System.out.println("\n3) Enter the standart unit of the " + i + " country and minutes of talk: ");
            c1 = sc1.nextInt();
            t1 = sc1.nextInt();
            System.out.println(i + " talk " + c1 * t1 );
            sum += c1 * t1;
        }
        System.out.println("All talks together " + sum );
    }
}
