package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling_ReadAndWrite {
    public static void main(String[] args) {
        String str;
        try{
            FileInputStream fis = new FileInputStream("D:\\Test.java");
            FileOutputStream fos = new FileOutputStream("D:\\Out.txt");
            int i;
            while((i=fis.read())!=-1)
            {
//                str = String.valueOf((char)i);
//                System.out.print(str);
//                byte[] b =str.getBytes();
//                fos.write(b);
                fos.write(i);
            }
            fis.close();
            fos.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }


    }
}
