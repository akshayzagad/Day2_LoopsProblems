package com.bridglabz;

import java.util.Scanner;

public class Quad {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Value of a: ");
        int a = scanner.nextInt();
        System.out.println("Enter the Value of b: ");
        int b= scanner.nextInt();
        System.out.println("Enter the Value of c: ");
        int c= scanner.nextInt();
        double Delta=b*b-4*a*c;
        if (Delta>0){
            int root1= (int) (-b+Math.sqrt(Delta)/(2*a));
            System.out.println("roots are real and distinct "+root1);
        }
        else if (Delta<0){
            int root2= (int) (-b+Math.sqrt(Delta)/(2*a));
            System.out.println("Imagnary Roots "+root2);
        }
        else {
            System.out.println("Roots Arre equal and root value is 0");
        }
    }
}
