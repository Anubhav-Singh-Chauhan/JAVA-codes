package com.company;
import java.lang.Thread;
//Thread Class
class Test extends Thread
{
    public void run()
    {
        System.out.println("Thread Task");
    }
}

public class ThreadClass {
    public static void main(String[] args) {
        Test t = new Test();
        t.start();
    }
}
