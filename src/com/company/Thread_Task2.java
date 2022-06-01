package com.company;

import java.lang.Thread;

//Performing Multiple Task From Single Threads(Not Possible)
//Performing Multiple Task From Multiple Threads
class A1 extends Thread{
    public void run(){
        System.out.println("A1 Class");
    }
}

class A2 extends Thread{
    public void run()
    {
        System.out.println("A2 Class");
    }
}

public class Thread_Task2{
    public static void main(String[] args) //Main Thread(Created by JVM), it is created by default.
    {
        A1 obj = new A1(); //Thread 1
        obj.start();
        A2 obj1 = new A2(); //Thread 2
        obj1.start();
    }
}
