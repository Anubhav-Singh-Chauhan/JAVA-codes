package com.company;
import java.lang.Thread;

class Test extends Thread
{
    public void run()
    {
        System.out.println("Thread Task");
    }
}

public class Practice_7 {
    public static void main(String[] args) {
        Test t = new Test();
        t.start();
    }
}
