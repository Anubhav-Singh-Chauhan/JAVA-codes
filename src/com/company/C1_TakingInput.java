package com.company;
import java.util.Scanner;

public class C1_TakingInput {
    public static void main(String[] args){
        System.out.println("Take Input");
        Scanner sc = new Scanner(System.in);  //To read the data from keyboard
//        System.out.println("Enter no. 1");
//        //int a = sc.nextInt();
//        float a = sc.nextFloat();
//        System.out.println("Enter no. 2");
//        //int b = sc.nextInt();
//        float b = sc.nextFloat();
//        float sum = a+b;
//        System.out.println("Sum of numbers is");
//        System.out.println(sum);
//        boolean b1 = sc.hasNextInt();
//        System.out.println(b1);
//        String str = sc.next();
        String str = sc.nextLine(); //read full sentence
        System.out.println(str);

    }

}
