package com.company;

public class Code17_VarArgs {
    static  int func1(int ...arr) {
        int sum=0;
        for (int a: arr)
        {
            sum+=a;
        }
        return sum;
    }

    static  int func2(int x,int ...arr) {
        int sum=x;
        for (int a: arr)
        {
            sum+=a;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum of nothing is "+func1()); //func1 can be called with zero or more arguments
        System.out.println("Sum of 2,3,4,5 is "+func1(2,3,4,5));
        System.out.println("Sum of 5,5,5,5 is "+func1(5,5,5,5));
        System.out.println("Sum of 10,20,30,40,50,60"+func1(10,20,30,40,50,60));

        int a=10;

        System.out.println("Sum of a and 2 is "+func2(a,2));  //In func2 one argument must be passed.

    }
}
