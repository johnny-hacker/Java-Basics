/*
Programmer: Olmedo, Johnny
Submission date: 02/06/2022 
This program calculates grocery bills for the month with and without a coupon
*/

import java.util.Scanner;

public class GroceryBill {
    public static void main(String [] args) {
        // Explain what we are doing. 
        System.out.println("This program calculates grocery bills for the month with and without a coupon\n");
        // ask the user if they wish to continue  
        System.out.print("Do you wish to continue [Y/N]? :  "); 
        try(Scanner sc = new Scanner(System.in)) {
            char answer = sc.next().charAt(0);
            // while user input is "Y" or "y" 
            while (answer == 'Y' || answer == 'y' ) {
                // declare the variables that will be used for the program
                double monthly_coupon; // monthly avaerage with coupon
                double weekly_coupon; // weekly average with coupon
                double monthly_average;  // monthly average
                double weekly_average; // weekly average
                double coupon; // coupon
                double week1; // week 1 gocery bills 
                double week2; // week 2 gocery bills 
                double week3; // week 3 gocery bills 
                double week4; // week 4 gocery bills 

                // begin taking down information abot the copoun amount
                System.out.print("\nPlease enter amount of coupon as a decimal: ");
                coupon = sc.nextDouble();

                // turn it into a number you can easily compare 
                coupon *= 100; // coupon = coupon * 100
                // if coupon is less than 10 or more than 100
                if (coupon < 10 || coupon > 100) {
                    // make the coupon 10 percent at default
                    coupon = 10;
                }
                // return coupon to the original entry
                coupon = coupon / 100;

                // ask for grocer bills
                // week 1
                System.out.print("Please enter out amount paid for groceries in the first week of this month : ");
                week1 = sc.nextDouble();
                // week 2
                System.out.print("Please enter out amount paid for groceries in the second week of this month : ");
                week2 = sc.nextDouble();
                // week 3
                System.out.print("Please enter out amount paid for groceries in the third week of this month : ");
                week3 = sc.nextDouble();
                // week 4
                System.out.print("Please enter out amount paid for groceries in the fourth week of this month : ");
                week4 = sc.nextDouble();

                // calculate monthly and weekly average
                monthly_average = week1 + week2 + week3 + week4;
                weekly_average = monthly_average / 4;

                // calculate averages with coupon
                monthly_coupon = monthly_average - (monthly_average * coupon); 
                weekly_coupon = weekly_average - (weekly_average * coupon);
                
                System.out.println("\nGrocery Bills Calculations:");
                // print out without coupon 
                System.out.println("\nMonthly average: " + monthly_average);
                System.out.println("Weekly average: " + weekly_average);
                
                // print out with coupon applied
                System.out.println("Monthly average with coupon applied: " + monthly_coupon);
                System.out.println("Weekly average with coupon applied: " + weekly_coupon);
                
                // ask the user if they wish to continue  
                System.out.print("\nDo you wish to run the prgram again [Y/N]? :  "); 
                answer = sc.next().charAt(0);

            }
            // End program gracefully
            System.out.println("\nThank you and goodbye!"); 
        }
    }
 } 