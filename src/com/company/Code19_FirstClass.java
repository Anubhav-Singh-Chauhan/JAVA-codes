package com.company;
class Student{
    int roll_No;
    String address;
    void Details(){
        System.out.println("My roll number is: " + roll_No );
        System.out.println("My address is: " + address);
    }

}
public class Code19_FirstClass {
    public static void main(String[] args) {
        Student xyz = new Student();
        Student abc = new Student();
        xyz.roll_No=12;
        xyz.address="Dehradun";
        abc.roll_No=2;
        abc.address="Mumbai";
        System.out.println(xyz.roll_No + " " + xyz.address);
        xyz.Details();
        abc.Details();
    }
}
