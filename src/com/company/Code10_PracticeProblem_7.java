package com.company;
import java.util.Scanner;
public class Code10_PracticeProblem_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0;i<=10;i++){
            System.out.printf("%d x %d = %d\n",n,i,n*i);
            sum = sum + (n*i);
        }
        System.out.printf("Sum of Results is: %d\n ",sum);
    }
}
