package com.example.demo;

public class DemoClass {
    public static void main(String[] args) {
        int a=3;
        int b=4;
        int c=0,d=0;
        System.out.println("\nA:"+a+"\nB:"+b+"\nC:"+c+"\nD:"+d);
        c=++a;
        d=b++;
        //c++;
        System.out.println("\nA:"+a+"\nB:"+b+"\nC:"+c+"\nD:"+d);

        System.out.println((char)('B'+32));
    }
}
