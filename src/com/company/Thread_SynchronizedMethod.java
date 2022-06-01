package com.company;

class BookSeat1
{
    int total_seats =10;
    synchronized void bookSeat1(int seats)
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


public class Thread_SynchronizedMethod extends Thread{
    static BookSeat1 b;
    int seats;
    public void run()
    {
        b.bookSeat1(seats);
    }
    public static void main(String[] args) {
        b = new BookSeat1();
        Thread_SynchronizedMethod peter = new Thread_SynchronizedMethod();
        peter.seats = 7;
        peter.start();

        Thread_SynchronizedMethod sam = new Thread_SynchronizedMethod();
        sam.seats=6;
        sam.start();
    }
}
