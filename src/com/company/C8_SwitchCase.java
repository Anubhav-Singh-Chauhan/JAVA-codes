package com.company;
import java.util.Scanner;
public class C8_SwitchCase {
    public static void main(String[] args) {
        char A;
        Scanner sc = new Scanner(System.in);
        A = sc.next().charAt(0);
        switch(A){  //this switch can be converted to enhance switch of if else by just one click
            case 'a':
                System.out.println("First alphabet");
                break;
            case 'b':
                System.out.println("Second alphabet");
                break;
            case 'c':
                System.out.println("Third alphabet");
                break;
            default:
                System.out.println("Not the first second and third alphabet");
        }
    }
}
