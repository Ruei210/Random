package com.ruei;

import java.io.*;
import java.lang.reflect.GenericDeclaration;
import java.nio.CharBuffer;
import java.util.Scanner;

public class PiggyBank {
    public static void main(String[] args) {

        Integer iTotal = 0;    //iTatal 已存的錢
        Integer m = null;   //null空值
        try {
            FileReader fr = null;
            fr = new FileReader("total.txt");
            BufferedReader br = new BufferedReader(fr);
            String sReadTotal = br.readLine();
            if (sReadTotal != null) {
                iTotal = Integer.valueOf(sReadTotal);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Current total: " + iTotal);
        System.out.println("Please enter your coin：");
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();
        while (m > 0) {
            iTotal += m;
            System.out.println("Current total: " + iTotal);
            System.out.println("Please enter your coin： ");
            m = scanner.nextInt();
        }

        String sTotal = String.valueOf(iTotal);
        try {
            FileWriter fw = new FileWriter("total.txt");
            fw.write(sTotal);
            fw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}