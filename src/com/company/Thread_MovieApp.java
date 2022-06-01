package com.company;

class BookSeat
{
    int total_seats =10;
    void bookSeat(int seats)
    {
        if(total_seats>=seats)
        {
            System.out.println("Seats Booked Successfully");
            total_seats = total_seats - seats;
            System.out.println("Seats Left: "+total_seats);
        }
        else
        {
            System.out.println("Seats cannot be booked");
            System.out.println("Seats Left: "+total_seats);
        }
    }
}


public class Thread_MovieApp extends Thread{
    static BookSeat b;
    int seats;
    public void run()
    {
        b.bookSeat(seats);
    }
    public static void main(String[] args) {
     b = new BookSeat();
     Thread_MovieApp peter = new Thread_MovieApp();
     peter.seats = 7;
     peter.start();

     Thread_MovieApp sam = new Thread_MovieApp();
     sam.seats=6;
     sam.start();
    }
}
/*

* Problems occur without Synchronization --
1. Data inconsistency
2. Thread Interference

* Synchronization -> Process by which we control the accessibility
                 of multiple threads to a particular shared resource.

* Disadvantages of Synchronization --
1. Increase the waiting time period of threads
2. Create performance problems

To overcome Synchronization disadvantages,
java provides one package i.e., java.util.concurrent.

 */