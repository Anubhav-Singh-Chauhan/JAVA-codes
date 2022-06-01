package com.company;

class BookSeat4
{
    static int total_seats = 20;
    synchronized static void bookSeat4(int seats) //class level lock
    {
        if(total_seats>=seats)
        {
            System.out.println(seats+" Seats Booked Successfully");
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

class Mythread1 extends Thread{
    BookSeat4 b;
    int seats;
    Mythread1(BookSeat4 b, int seats)
    {
        this.b=b;
        this.seats=seats;
    }
        public void run ()
        {
            b.bookSeat4(seats);
        }
    }

class Mythread2 extends Thread
{
    BookSeat4 b;
    int seats;
    Mythread2(BookSeat4 b,int seats)
    {
        this.b=b;
        this.seats=seats;
    }
    public void run()
    {
        b.bookSeat4(seats);
    }
}

public class Static_Synchronization extends Thread{
    public static void main(String[] args) {
        BookSeat4 b1 = new BookSeat4();

        Mythread1 peter = new Mythread1(b1,9);
        peter.start();
        Mythread2 sam = new Mythread2(b1,6);
        sam.start();

        Mythread1 w1 = new Mythread1(b1,7);
        w1.start();
        Mythread2 w2 = new Mythread2(b1,6);
        w2.start();
    }
}
