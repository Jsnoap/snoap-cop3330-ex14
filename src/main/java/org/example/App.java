/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    // Function to compute tax on an order
    // Prompt user for an amount and a state
    // WI has a tax rate of 5.5%. Add this on if WI is entered, if another state is entered, print total without tax.
    public static void main( String[] args )
    {
        double amount;
        String state;

        System.out.println("What is the order amount?");
        Scanner inputAmount = new Scanner(System.in);
        amount = inputAmount.nextDouble();

        System.out.println("What is the state?");
        Scanner inputState = new Scanner(System.in);
        state = inputState.next();

        if (state.equals("WI"))
        {
            System.out.println("The subtotal is $" + String.format("%.2f", amount) + ".\n" + "The tax is $"+ String.format("%.2f", .055 * amount) + ".\n" + "The total is $" + String.format("%.2f", (.055 * amount) + amount) + ".");
            return;
        }

        System.out.println("The total is $" + String.format("%.2f", amount) + ".");
    }
}
