/*
Module 2 Option 2
Programmer: Olmedo, Johnny
CSC 320
Submission date: 01/30/2022 
This program detrmines data usage for the user
*/

import java.util.Scanner;

public class DataUsage1 {
    public static void main(String [] args) {
    // try opening this scanner 
    try (Scanner sc = new Scanner(System.in)) {
        // declare the variables that will be used for the program
            String phone_provider;  // phone provider
            String phone_model; // phone model
            double monthly_minutes;  // last name
            double monthly_data; // street address
            double current_minutes; // city
            double current_data; // zip code

            // begin taking down information abot the phone company, model, minutes, and data
            // start with phone provider
            System.out.print("Please enter current phone provider: ");
            phone_provider = sc.nextLine();
            // ask for the phone model
            System.out.print("Please enter the phone model: ");
            phone_model = sc.nextLine();
            // get number of calling minutes 
            System.out.print("Please enter the number of calling minutes on your phone plan: ");
            monthly_minutes = sc.nextDouble();
            // get number of gigabits of data 
            System.out.print("Please enter the number of Gigabites of data on your phone plan: ");
            monthly_data = sc.nextDouble();
            // get number of minutes used currently
            System.out.print("Please enter the number of calling minutes already used this month: ");
            current_minutes = sc.nextDouble();
            // get number of gigs used for the month
            System.out.print("Please enter the number of Gigabits of data already used this month: ");
            current_data = sc.nextDouble();

            // print info recieved
            System.out.println("\nPhone Information:\n"); 
            // phone provider
            System.out.println("Phone Provider: " + phone_provider);
            // phone model
            System.out.println("Phone Model: " + phone_model);
            // current minutes
            System.out.println("Monthly calling minutes for your plan: " + monthly_minutes);
            // current data
            System.out.println("Monthly Gigabits of data for your plan: " + monthly_data);
            // minutes used
            System.out.println("Monthly calling minutes already used: " + current_minutes);
            // gigs used
            System.out.println("Monthly Gigabits of data already used: " + current_data);
            // mins left 
            System.out.println("Calling minutes left for the month: " + (monthly_minutes - current_minutes));
            // gigs used
            System.out.println("Calling minutes left for the month: " + (monthly_data - current_data));
 
        }
    }
 } 