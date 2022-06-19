package com.company;

import java.io.FileInputStream;
import java.io.IOException;

public class FileHandling_ReadData {
    public static void main(String[] args)  {
        FileInputStream fis=null;
        try {
            fis = new FileInputStream("D:\\Test.java");
            int i;
            while ((i= fis.read()) != -1) {
                System.out.print((char) i);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        finally {
            try{
                fis.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
