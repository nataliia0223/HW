package com.main;
import java.util.Scanner;

public class Main {
    public static  void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = sc.nextInt();
        int x = n * n;
        String str = Integer.toString(x);
        String str1 = Integer.toString(n);
        Numb numb = new Numb();
        numb.contain(str, n);
        System.out.println("2) Reverse: " + numb.reverseStr(str1));
        System.out.println("3) Replacement: " + numb.firstLast(str1));
        System.out.println("4) Plus 1: " + numb.one(str1));
    }
}
