package com.company;
import java.util.Scanner;
import java.util.*;
public class C9_PracticeProblem_6 {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        int x;
        int count = 0;

        int random = ran.nextInt(3);
        while (count < 3) {
            count++;
            System.out.println("""
                    1. Enter 0 for Rock
                    2. Enter 1 for Scissor
                    3. Enter 2 for Paper
                    """);
            System.out.print("Enter the number: ");
            x = sc.nextInt();
            System.out.println("Computer number: " + random);

            if (x == random) {
                System.out.println("Draw");
            }
            if (x == 1 && random == 0) {
                System.out.println("Computer -> Rock  You -> Scissor\nComputer won");
            }
            if (x == 0 && random == 1) {
                System.out.println("Computer -> Scissor  You -> Rock\nYou won");
            }
            if (x == 1 && random == 2) {
                System.out.println("Computer -> Paper  You -> Scissor\nYou won");
            }
            if (x == 2 && random == 1) {
                System.out.println("Computer -> Scissor  You -> Paper\nComputer won");
            }
            if (x == 0 && random == 2) {
                System.out.println("Computer -> Paper  You -> Rock\nComputer won");
            }
            if (x == 2 && random == 0) {
                System.out.println("Computer -> Rock  You -> Paper\nYou won");
            }

        }
    }
    }


