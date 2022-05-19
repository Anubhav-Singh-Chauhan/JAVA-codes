package com.company;
import java.util.*;
import java.lang.String;
class Employee{
    int age;
    String name;
    int salary;

    Scanner sc = new Scanner(System.in);
    public Employee(String department)
    {
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        this.age=age;
        System.out.println("Enter salary: ");
        int salary = sc.nextInt();
        this.salary=salary;
        System.out.println("Enter name of employee: ");
        String name = sc.nextLine();
        this.name=name;

    }

}

public class Practice_3 {
    public static void main(String[] args) {
     Employee Emp[] = new Employee[8];
     Emp[0]=new Employee("A");
//     Emp[0].department.equals("A");
     Emp[1]=new Employee("C");
//     Emp[1].department.equals("B");
     Emp[2]=new Employee("D");
//     Emp[2].department.equals("D");
     Emp[3]=new Employee("A");
//     Emp[3].department.equals("C");
     Emp[4]=new Employee("C");
//     Emp[4].department.equals("A");
     Emp[5]=new Employee("B");
//     Emp[5].department.equals("D");
     Emp[6]=new Employee("A");
//     Emp[6].department.equals("B");
     Emp[7]=new Employee("D");
//     Emp[7].department.equals("A");
     Emp[8]=new Employee("A");
//     Emp[8].department.equals("C");

     for(int i=0;i< Emp.length;i++){
         System.out.println("Name: "+Emp[i].name+"Age: "+Emp[i].age+"Department: ");
         if(Emp[i].salary<=30000){
             System.out.println("Salary is "+Emp[i].salary);
         }
         else if(Emp[i].salary>30000){
             Emp[i].salary=25000;
             System.out.println("Salary is: "+Emp[i].salary);
         }
     }

    }
}
