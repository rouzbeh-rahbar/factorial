package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n=sc.nextInt();
        for(int i=n; i>=1; i--){
            fact*=i;
        }
        System.out.println(n + " factorial is " + fact);
    }
}
