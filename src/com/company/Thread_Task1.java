package com.company;
import java.lang.Thread;

//Performing Single Task From Multiple Threads

public class Thread_Task1 extends Thread{
    public void run()
    {
        System.out.println("Hello");
    }
    public static void main(String[] args) //Main Thread(Created by JVM), it is created by default.
    {
     Thread_Task1 obj = new Thread_Task1(); //Thread 1
     obj.start();
     Thread_Task1 obj1 = new Thread_Task1(); //Thread 2
     obj1.start();
    }
}
