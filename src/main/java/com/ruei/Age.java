package com.ruei;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine(); //輸入為字串
        System.out.println(s);
        //Integer s = scanner.nextInt(); 輸入為整數

        try {
            int age = Integer.parseInt(s);
            System.out.println((Math.sqrt(age)));
        }catch(NumberFormatException e){
            System.out.println("Hello"); //e.printStackTrace();能測試e的錯誤

        }
    }
}
