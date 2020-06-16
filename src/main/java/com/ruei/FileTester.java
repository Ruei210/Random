package com.ruei;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileTester {
    public static void main(String[] args) /*throws IOException 同於try catch方法*/ {
      /*  File file = new File("abc.txt");
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());*/
        try {
            FileWriter writer = new FileWriter("abc.txt");
            writer.write(65); //A
            writer.write(66); //B
            writer.write("hahahahaha");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
