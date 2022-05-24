package com.company;
import java.lang.*;

//Runnable Interface - This the better way to create thread.

public class RunnableInterface implements Runnable
{
    public void run()
    {
        System.out.println("Thread Task");
    }
    public static void main(String[] args)
    {
        RunnableInterface t = new RunnableInterface();
        //Create an object of Thread Class and pass the parameter in the constructor.
        Thread th = new Thread(t);
        th.start();
    }
}
