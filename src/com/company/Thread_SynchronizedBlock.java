package com.company;
import java.lang.Thread;
class BookSeat2
{
    int total_seats =10;
      void bookSeat2(int seats) {
          System.out.println("hi " + Thread.currentThread().getName());
          System.out.println("hi " + Thread.currentThread().getName());
          System.out.println("hi " + Thread.currentThread().getName());
          System.out.println("hi " + Thread.currentThread().getName());
          System.out.println("hi " + Thread.currentThread().getName());
          synchronized (this) {
              if (total_seats >= seats) {
                  System.out.println("Seats Booked Successfully");
                  total_seats = total_seats - seats;
                  System.out.println("Seats Left: " + total_seats);
              } else {
                  System.out.println("Seats cannot be booked");
                  System.out.println("Seats Left: " + total_seats);
              }
          }
          System.out.println("hi " + Thread.currentThread().getName());
          System.out.println("hi " + Thread.currentThread().getName());
          System.out.println("hi " + Thread.currentThread().getName());
          System.out.println("hi " + Thread.currentThread().getName());
          System.out.println("hi " + Thread.currentThread().getName());
      }
}


public class Thread_SynchronizedBlock extends Thread{
    static BookSeat2 b;
    int seats;
    public void run()
    {
        b.bookSeat2(seats);
    }
    public static void main(String[] args) {
        b = new BookSeat2();
        Thread_SynchronizedBlock peter = new Thread_SynchronizedBlock();
        peter.seats = 7;
        peter.start();

        Thread_SynchronizedBlock sam = new Thread_SynchronizedBlock();
        sam.seats=6;
        sam.start();
    }
}

