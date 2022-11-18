package com.bridglabz;

import java.util.Scanner;

public class ArthmaticOpration {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Value of a: ");
        int a = scanner.nextInt();
        System.out.println("Enter the Value of b: ");
        int b= scanner.nextInt();
        System.out.println("Enter the Value of c: ");
        int c= scanner.nextInt();
        int Opration1=a+b*c;
        int Opration2=c+a/b;
        int Opration3=a%b+c;
        int Opration4=a*b+c;
        System.out.println("Opration 1 "+ Opration1);
        System.out.println("Opration 2 "+ Opration2);
        System.out.println("Opration 3 "+ Opration3);
        System.out.println("Opration 4 "+ Opration4);
        if (Opration1>Opration2 && Opration1>Opration3 && Opration1>Opration4){
        System.out.println("Opration 1 is Greater");
        }
        else if (Opration2>Opration1 && Opration2>Opration3 && Opration2>Opration4) {
        System.out.println("Opration 2 is Greater");
        }
        else if (Opration3>Opration1 && Opration3>Opration2 && Opration3>Opration4) {
        System.out.println("Opration 3 is Greater");
       }
        else {
        System.out.println("Opration 4 is Greater");
       }
    }
}
