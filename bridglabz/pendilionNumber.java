package com.bridglabz;

import java.util.Scanner;

public class pendilionNumber {
    public static void main(String[] args) {
        System.out.println("enter the number=  ");
        Scanner scanner=new Scanner(System.in);
        int Numbers= scanner.nextInt();
       int Reverse= Reverse_the_Number(Numbers);
        if (Numbers==Reverse){
            System.out.println("The Number is pendilionNumber");
        }else{
            System.out.println("The Number is not pendilionNumber");
        }
    }
    static int Reverse_the_Number(int Numbers){
        int Reverse=0;
        while (Numbers!=0){
            int Remainder=Numbers%10;
            Reverse=Reverse*10+Remainder;
            Numbers=Numbers/10;
        }
        System.out.println("Reverce_Numbers==>" +Reverse);
        return Numbers;
    }
}
