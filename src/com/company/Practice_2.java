package com.company;
import java.util.*;

class StudentA{
String name;
int age;
char section='A';
float percentage;
Scanner sc = new Scanner(System.in);
StudentA()
{
    System.out.println("Enter your Name: ");
    name = sc.nextLine();
    System.out.println("Enter your age: ");
    age = sc.nextInt();
    System.out.println("Enter you percentage: ");
    percentage = sc.nextFloat();
}
}

public class Practice_2 {
    public static void main(String[] args) {
        float avg;
        StudentA S1 = new StudentA();
        StudentA S2 = new StudentA();
        StudentA S3 = new StudentA();
        StudentA S4 = new StudentA();
        StudentA S5 = new StudentA();

        avg= (S1.percentage+ S2.percentage+ S3.percentage+ S4.percentage+ S5.percentage)/5;

        System.out.println("Average is: "+avg);

    }
}
