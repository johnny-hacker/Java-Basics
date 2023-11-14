/*
Programmer: Olmedo, Johnny
Submission date: 02/27/2022 
This program demonstrates the use of objects, methods, and exception handeling\n
*/


import java.util.Scanner;

public class ScannerInputMain {
    public static void main(String [] args) {
        // Explain what we are doing. 
        System.out.println("This program demonstrates the use of objects, methods, and exception handeling\n");
        // ask the user if they wish to continue  
        System.out.print("Do you wish to continue [Y/N]? :  "); 
        try(Scanner sc = new Scanner(System.in)) {
            char answer = sc.next().charAt(0);
            // while user input is "Y" or "y" 
            while (answer == 'Y' || answer == 'y' ) {
                try {
                    // declare strings 
                    String first_string;
                    String second_string;
                    String third_string;
                    // create an instance of the Scanner function
                    ScannerInput getInput = new ScannerInput();
                    
                    // call the function that will get input and return whether the function
                    // succeeded or failed/ throws exception
                    // first string
                    System.out.println("\nPlease enter the first name or enter 'zero' to throw exception");
                    first_string = getInput.Scanner(sc);
                    System.out.println("\nThe method called was a: " + first_string);
                    // second string
                    System.out.print("\nPlease enter the second name or enter 'zero' to throw exception\n");
                    second_string = getInput.Scanner(sc);
                    System.out.println("\nThe method called was a: " + second_string);
                    // third string
                    System.out.print("\nPlease enter the third name or enter 'zero' to throw exception\n");
                    third_string = getInput.Scanner(sc);
                    System.out.println("\nThe method called was a: " + third_string);
                    
                  // catch exception thrown
                } catch (Exception excpt) {
                    //System.out.println("The method called was a: "); // indicate message failure
                    System.out.println("\nThe method called was a: " + excpt.getMessage()); // get exception message
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