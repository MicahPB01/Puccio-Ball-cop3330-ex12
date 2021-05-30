package oop.example;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int  principle;
        double interest;
        int numYears;
        double value;
        double percentage;

        System.out.printf("Enter the principal: ");
        principle = Integer.parseInt(input.nextLine());

        System.out.printf("Enter the rate of interest: ");
        interest = Double.parseDouble(input.nextLine());

        System.out.printf("Enter the number of years: ");
        numYears = Integer.parseInt(input.nextLine());

        value = (double) principle * (1 + (interest*numYears)/100);
        value = Math.round(value * 100.0) /100.0;
        percentage = interest/100;

        System.out.printf("After %d years at%4.1f%%, the investment will be worth $%.2f.\n", numYears, interest, value);

    }
}
