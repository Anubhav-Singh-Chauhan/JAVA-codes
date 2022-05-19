package com.company;
import java.util.Scanner;

class AgeException extends RuntimeException{
    AgeException(String str){
        super(str);
    }
}

public class Practice_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age: ");
        int age = sc.nextInt();
        try {
            if (age < 18) {
                throw new AgeException("Your are not Eligible");
            } else {
                System.out.println("You can vote");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Success");
    }
}
