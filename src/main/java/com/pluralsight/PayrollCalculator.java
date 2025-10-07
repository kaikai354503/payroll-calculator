package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    static Scanner input = new Scanner(System.in);
    static double wage = 17.60;

    public static void main(String[] args) {

        yourName();
        double workTime =  hours();
        double total = grossPay(workTime);
        System.out.println(total);

    }

    public static void yourName() {


        System.out.println("What is your name? ");

        String name = input.nextLine();
        System.out.println("Hello, " + name);
    }

    public static double hours() {

        System.out.println("How many hours did you work? ");

        String s = input.nextLine();

        double workTime = Double.parseDouble(s);

        return workTime;
    }

    public static double grossPay(double workTime) {

        double totalPay = (wage * workTime);

        return totalPay;

    }
}







