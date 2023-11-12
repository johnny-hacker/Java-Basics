/*
Programmer: Olmedo, Johnny
Submission date: 02/20/2022 
This program calculates grade statistic using a for loop
*/


import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class MonthlyTemp {
    public static void main(String [] args) {
        // Explain what we are doing. 
        System.out.println("This program stores and displays monthly tempatures of Colorado for the year\n");
        // ask the user if they wish to continue  
        System.out.print("Do you wish to continue [Y/N]? :  "); 
        try(Scanner sc = new Scanner(System.in)) {
            char answer = sc.next().charAt(0);
            // while user input is "Y" or "y" 
            while (answer == 'Y' || answer == 'y' ) {
                // initialize arrayLists that will hold user inputs
                ArrayList<String> month = new ArrayList<String>(); // holds months
                ArrayList<Double> temp = new ArrayList<Double>(); // holds tempature of each month

                // declare the variables that will be used for the program
                String userInput; // this will hold the input
                double yearlyAverage; // yearly average
                double tempMax; // max temp in all months
                double tempMin; // min temp in all months
                double sum = 0; // calculate the sum
                int i; // counter

                // add month names to the months arrayList
                month.add("January");
                month.add("February"); 
                month.add("March");
                month.add("April");
                month.add("May");
                month.add("June");
                month.add("July");
                month.add("August");
                month.add("September");
                month.add("Octber");
                month.add("November");
                month.add("December");

                // add monthly temps in degrees farenheight to the temp arrayist
                temp.add(47.00); // january
                temp.add(49.00); // february
                temp.add(56.00); // march
                temp.add(62.00); // april
                temp.add(72.00); // may
                temp.add(81.00); // june
                temp.add(88.00); // july
                temp.add(86.00); // august
                temp.add(78.00); // september
                temp.add(66.00); // october
                temp.add(54.00); // november
                temp.add(46.00); // december
                
                // prompt user input
                System.out.println("\nPlease enter the month you would like to see (e.g 'January') or"); 
                System.out.print("type 'year' to see the yearly temps and average: ");
                userInput = sc.next();

                // use switch statement to determine which month the user entered
                switch (userInput) {
                    case "January":
                        System.out.println("\nAverage temp for the month of \n");
                        System.out.print(month.get(0) + ": " + temp.get(0) + " degrees farenheit\n");
                        break;
                    case "February":
                        System.out.println("\nAverage temp for the month of \n");
                        System.out.print(month.get(1) + ": " + temp.get(1) + " degrees farenheit\n");
                        break;
                    case "March": 
                        System.out.println("\nAverage temp for the month of \n");
                        System.out.print(month.get(2) + ": " + temp.get(2) + " degrees farenheit\n");
                        break;
                    case "April": 
                        System.out.println("\nAverage temp for the month of \n");
                        System.out.print(month.get(3) + ": " + temp.get(3) + " degrees farenheit\n");
                        break;
                    case "May": 
                        System.out.println("\nAverage temp for the month of \n");
                        System.out.print(month.get(4) + ": " + temp.get(4) + " degrees farenheit\n");
                        break;
                    case "June": 
                        System.out.println("\nAverage temp for the month of \n");
                        System.out.print(month.get(5) + ": " + temp.get(5) + " degrees farenheit\n");
                        break;
                    case "July": 
                        System.out.println("\nAverage temp for the month of \n");
                        System.out.print(month.get(6) + ": " + temp.get(6) + " degrees farenheit\n");
                        break;
                    case "August": 
                        System.out.println("\nAverage temp for the month of \n");
                        System.out.print(month.get(7) + ": " + temp.get(7) + " degrees farenheit\n");
                        break;
                    case "September": 
                        System.out.println("\nAverage temp for the month of \n");
                        System.out.print(month.get(8) + ": " + temp.get(8) + " degrees farenheit\n");
                        break;
                    case "October": 
                        System.out.println("\nAverage temp for the month of \n");
                        System.out.print(month.get(9) + ": " + temp.get(9) + " degrees farenheit\n");
                        break;
                    case "November": 
                        System.out.println("\nAverage temp for the month of \n");
                        System.out.print(month.get(10) + ": " + temp.get(10) + " degrees farenheit\n");
                        break;
                    case "December": 
                        System.out.println("\nAverage temp for the month of \n");
                        System.out.print(month.get(11) + ": " + temp.get(11) + " degrees farenheit\n");
                        break;
                    default:
                        break;
                }

                // if the user types 'year'
                if (userInput.equals("year")){
                    // print out each month and temp
                    System.out.println("\nMonth   Average Temp\n");
                    for (i = 0; i < month.size(); i++) {
                        System.out.println(month.get(i) + " : " + temp.get(i));
                        sum += temp.get(i); // add up all the temps in the list
                    }

                    // calculate yearly temp average, max and min
                    yearlyAverage = sum / temp.size(); // sum / # of elements in array
                    tempMax = Collections.max(temp); // max
                    tempMin = Collections.min(temp); // min  
                    
                    // print out yearly average, highest and lowest temps
                    System.out.println("\nYearly Average: " + yearlyAverage); 
                    System.out.println("Highest Monthly Average: " + tempMax);
                    System.out.println("Lowest Monthly Average: " + tempMin + "\n");

                }

                // ask the user if they wish to continue  
                System.out.print("\nDo you wish to run the program again [Y/N]? :  "); 
                answer = sc.next().charAt(0);

            }
            // End program gracefully
            System.out.println("\nThank you and goodbye!"); 
        }
    }

}