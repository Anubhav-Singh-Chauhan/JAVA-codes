package com.company;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling_WriteData {
    public static void main(String[] args) {
        FileOutputStream fos=null;
        try {
            String str = "From FileHandling_WriteData-File";
            fos = new FileOutputStream("D:\\Out.txt");
            byte b[] = str.getBytes();
            fos.write(b);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
