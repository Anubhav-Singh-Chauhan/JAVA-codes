package com.company;

public class Code18_Recursion {
    static int fib(int n){
        if(n==0) {
            return 0;
        }
        else if(n==1){
                return  1;
        }
        else{
            return fib(n-1)+fib(n-2);
        }

        }

    public static void main(String[] args) {
        int x=5;
        System.out.printf("Fib of %d: ",x);

        for(int i=0;i<x;i++){
            System.out.printf("%d ",fib(i));
        }

    }
}
