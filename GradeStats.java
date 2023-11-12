/*
Programmer: Olmedo, Johnny
Submission date: 02/13/2022 
This program calculates grade statistic using a for loop
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class GradeStats {
    public static void main(String [] args) {
        // Explain what we are doing. 
        System.out.println("This program calculates grade statistics using a for loop\n");
        // ask the user if they wish to continue  
        System.out.print("Do you wish to continue [Y/N]? :  "); 
        try(Scanner sc = new Scanner(System.in)) {
            char answer = sc.next().charAt(0);
            // while user input is "Y" or "y" 
            while (answer == 'Y' || answer == 'y' ) {
                // initialize arrayList that will hold user inputs
                ArrayList<Double> grades = new ArrayList<Double>();
                // declare the variables that will be used for the program
                double gradeEntry; // this will hold the input
                double gradeAverage; // average
                double gradeMax; // max
                double gradeMin; // min
                double sum = 0; // calculate the sum
                int i; // counter
                
                // get the user inputs using for loop
                for (i = 0; i < 10; i++){
                    // begin asking the user for the grade each time
                    System.out.print("\nPlease enter grade number " + (i+1) + " of the class: ");
                    gradeEntry = sc.nextDouble();
                    grades.add(gradeEntry); // append each entry to the list

                    // add each user input together and assign to sum
                    sum += grades.get(i);
                } 
                
                // Calculate the average, max, and min
                gradeAverage = sum / grades.size();
                gradeMax = Collections.max(grades);
                gradeMin = Collections.min(grades);

                // print out the average, max, and min
                System.out.println("Grade averge: " + gradeAverage);
                System.out.println("Max grade: " + gradeMax);
                System.out.println("Min grade: " + gradeMin);

                // ask the user if they wish to continue  
                System.out.print("\nDo you wish to run the prgram again [Y/N]? :  "); 
                answer = sc.next().charAt(0);

            }
            // End program gracefully
            System.out.println("\nThank you and goodbye!"); 
        }
    }
} 