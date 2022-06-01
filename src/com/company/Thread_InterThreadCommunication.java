package com.company;

class TotalEarnings extends Thread
{
    int total=0;
    public void run() {
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                total = total + 100;
            }
            this.notify();
        }
    }
}
public class Thread_InterThreadCommunication {
    public static void main(String[] args) throws InterruptedException {
        TotalEarnings a = new TotalEarnings();
        a.start();
//System.out.println("Total Earnings: "+a.total);
        synchronized (a)
        {
            a.wait();
            System.out.println("Total Earnings: "+a.total);
        }
    }
}
