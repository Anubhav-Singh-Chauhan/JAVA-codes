package com.company;
//1. replace spaces with underscores in a string.
//2. Detect triple and double spaces in a string.
public class C6_PracticeProblem_4 {
    public static void main(String[] args) {
// 1.
        String str = "Hello good morning";
        System.out.println(str);
        System.out.println("Now we are replacing spaces with underscores, so string becomes");
        System.out.println(str.replace(' ','_'));
// 2.
        String s1 ="This  is a   string";
        System.out.print("Double spaces is at index: ");
        System.out.println(s1.indexOf("  "));
        System.out.print("Triple spaces is at index: ");
        System.out.println(s1.indexOf("   "));


    }
}
