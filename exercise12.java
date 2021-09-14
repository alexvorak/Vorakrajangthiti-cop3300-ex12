/*
 * UCF COP3330 FALL 2021 Assignment 1 Solution
 * Copyright 2021 Alex Vorakrajangthiti
 */

import java.util.Scanner;

public class exercise12 {
    public static void main(String[] args) {

        System.out.printf("Enter the principal: ");
        Scanner scanner = new Scanner(System.in);
        String principal = scanner.nextLine();
        int newPrin = Integer.parseInt(principal);

        System.out.printf("Enter the rate of interest (Please enter percentages as whole numbers):  ");
        Scanner scanner1 = new Scanner(System.in);
        String interest = scanner1.nextLine();
        double rateInterest = Double.parseDouble(interest);

        System.out.printf("Enter the number of years: ");
        Scanner scanner2 = new Scanner(System.in);
        String years = scanner2.nextLine();
        int newYears = Integer.parseInt(years);

        float compound;
        double interestrate = 0;
        interestrate = rateInterest/100;
        compound = (float)((interestrate*newYears+1)*newPrin);

        System.out.printf("After "+ years +" years at " + rateInterest);
        System.out.printf("%%, the investment will be worth $");
        System.out.printf("%.2f", compound);
    }
}