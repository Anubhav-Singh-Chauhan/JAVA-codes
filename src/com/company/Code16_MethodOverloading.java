package com.company;

public class Code16_MethodOverloading {
    public static void Func1() {
        System.out.println("one two three");
    }

    public static void Func1(int x) {
        System.out.println(x);
    }
    public static void Func1(int x,int y) {
        int sum;
        sum=x+y;
        System.out.println(sum);
    }
    //only by changing parameters, method overloading is possible not by changing return type

    public static void main(String[] args) {
        int a=90;
        int b=100;
        Func1();
        Func1(a);
        Func1(a,b);
    }
}
