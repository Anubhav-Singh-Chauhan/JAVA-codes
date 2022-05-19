package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class ReadWrite{
    void ReadFile() throws FileNotFoundException
    {
        FileInputStream fis = new FileInputStream("d:/abc.txt");
        //statements
    }
    void SaveFile() throws FileNotFoundException {
        String text = "some text";
        FileOutputStream fos = new FileOutputStream("d:/xyz.txt");
        //statements
    }
}

public class Practice_6 {
    public static void main(String[] args) //throws FileNotFoundException
    {
    ReadWrite rw = new ReadWrite();
    try {
        rw.ReadFile();
    }
    catch (FileNotFoundException e){
        e.printStackTrace();
    }
        System.out.println("Success");
    }
}
