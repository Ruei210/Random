package com.ruei;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final int Fee = 10;

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        List<Car> cars = new ArrayList<>();
        System.out.println("Welcome to parking system.");
        int func = 0;
        while (func != 4) {
            System.out.println("1)Car enter");
            System.out.println("2)Car leaving");
            System.out.println("3)Status");
            System.out.println("4)Exit");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            func = Integer.parseInt(s);

            switch (func) {
                case 1:
                    System.out.println("Plz enter car ID: ");
                    String id = scanner.nextLine();
                    Car c = new Car(id);
                    cars.add(c);
                    System.out.println("Car added");
                    break;
                case 2:
                    System.out.println("Plz enter car ID: ");
                    String leaveId = scanner.nextLine();
                    for (Car car : cars) {
                        if (car.id.equals(leaveId)) ;
                        long now = System.currentTimeMillis();
                        long duration = now - car.enter;
                        System.out.println(duration + "ms");
                        System.out.println();
                    }

                case 3:
                    for (Car car : cars) {
                        Date date = new Date(car.enter);
                        System.out.println(car.id + "/" + sdf.format(date) + "/" + car.leave);
                    }
                    break;
            }
        }
    }
}