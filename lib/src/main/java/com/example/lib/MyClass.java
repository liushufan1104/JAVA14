package com.example.lib;
import java.util.Scanner;
public class MyClass {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter three line long");
        int a,b,c,N;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        for(int i = 0;i<2;i++){
            if(a>b){
                N=a;
                a=b;
                b=N;
            }
            if (b>c){
                N=b;
                b=c;
                c=N;
            }
        }
        if((a+b)>c){
            System.out.print("Can form a triangle");
        }
        else {
            System.out.print("Can't form a triangle");
        }
    }
}