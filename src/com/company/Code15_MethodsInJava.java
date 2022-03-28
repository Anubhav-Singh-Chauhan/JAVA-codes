package com.company;


public class Code15_MethodsInJava {

     static int func1(int x, int y) {
      int sum;
      sum = x+y;
      return sum;
    }

     int func2(int x, int y) {
        int product;
        product = x*y;
        return product;
    }

    public static void main(String[] args) {
        int a=5;
        int b=3;

        System.out.printf("%d\n",func1(a,b));

        Code15_MethodsInJava obj = new Code15_MethodsInJava(); //method invocation using object creation
        obj.func2(a,b);
        System.out.println(obj.func2(a,b));



    }

}
