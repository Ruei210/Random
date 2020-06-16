package com.ruei;

import java.util.Scanner;

public class Billing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Total: ");
        int total = Integer.parseInt(scanner.nextLine());
        System.out.println("Need to split bill?");
        String yn =scanner.nextLine();
        if(yn.equalsIgnoreCase("y"));
            System.out.println("How many people? ");
            try {
                int p = Integer.parseInt(scanner.nextLine());
                int eachpaid = total / p;
                System.out.println("Each people paid: " + eachpaid);
            }catch(NumberFormatException e){
                System.out.println("Hello?! Try again");
            }catch(ArithmeticException e){   //數學運算產生的例外
                System.out.println("Fxck");
            }



    }
}
