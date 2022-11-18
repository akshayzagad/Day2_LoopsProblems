package com.bridglabz;

public class ReverseNumberUsingForLoop {
    public static void main(String[] args) {
        int Numbers =123;
        int Reverse=0;
        for (;Numbers!=0;){
            int Remainder=Numbers%10;
            Reverse=Reverse*10+Remainder;
            Numbers=Numbers/10;
        }
        System.out.println(Reverse);
    }
}
