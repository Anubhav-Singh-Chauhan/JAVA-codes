package com.company;
import java.lang.Thread;
//Thread Class
//Performing single task form single thread
class Test extends Thread
{
    public void run()
    {
        System.out.println("Thread Task");
    }
}

public class Thread_Class {
    public static void main(String[] args) {
        Test t = new Test();
        t.start();
    }
}
