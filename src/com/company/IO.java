package com.company;

import java.io.*;

public class IO {
    public static void main(String[] args)
    {
        FileInputStream f=null;
        FileOutputStream fo=null;
        try {
             f = new FileInputStream("C:\\Users\\chauh\\Desktop\\one.txt");
             fo = new FileOutputStream("D:\\me.txt");
            int i;
            while ((i = f.read()) != -1) {
//                System.out.print((char) i);
                fo.write(i);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            try
            {
                System.out.println("Succesfully Done");
                f.close();
                fo.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
