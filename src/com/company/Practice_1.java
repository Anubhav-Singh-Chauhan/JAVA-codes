package com.company;

import java.util.Scanner;
public class Practice_1
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        testClass obj = new testClass();
        obj.Display(a);
    }
}

interface in1{
    void Display(int i);
}

class testClass implements in1{
    public void Display(int i){
        int flag=0;
        if(i==0||i==1){
            System.out.println("Not a prime number");

        }
        else
        {
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    System.out.println("Not a prime number");
                    flag=1;
                    break;
                }
            }
        }

        if(flag==0){
            System.out.println("Prime number");
        }
    }
}
