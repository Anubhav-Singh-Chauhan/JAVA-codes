package com.company;
import java.util.Scanner;
public class Program_2 {
    public static void main(String[] args){
        float total, percentage;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of subject 1");
        float a = sc.nextFloat();
        System.out.println("Enter marks of subject 2");
        float b = sc.nextFloat();
        System.out.println("Enter marks of subject 3");
        float c = sc.nextFloat();
        System.out.println("Enter marks of subject 4");
        float d = sc.nextFloat();
        System.out.println("Enter marks of subject 5");
        float e = sc.nextFloat();

         total = (a+b+c+d+e);
         percentage = (total/500)*100;
        System.out.print("Your Percentage is: ");
        System.out.println(percentage + "%");

    }

}
