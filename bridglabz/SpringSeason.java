package com.bridglabz;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the  Date: ");
        int Date = scanner.nextInt();
        System.out.println("Enter the  Month: ");
        int Month= scanner.nextInt();
        int StarthOfSpringMonth=3;
        int EndOfSpringMonth=6;
        int SDate=20;
        int EDate=20;
        if (Month >= StarthOfSpringMonth && Month <= EndOfSpringMonth && Date >= SDate || Date <= EDate){
            System.out.println("Month is Spring Month");
        }
        else {
            System.out.println("Month is not Spring Month");
        }
    }
}
