/*
Module 6 Option 1
Programmer: Olmedo, Johnny
CSC 320
Submission date: 02/27/2022 
This program demonstrates the use of objects, methods, and exception handeling\n
*/

import java.util.Scanner;

public class ScannerInput {

    public String Scanner(Scanner sc) throws Exception{
        // declare variable being used
        String user_input = "";
        String success = "success";
        String failure = "failure";

        // ask the user for name entry
        System.out.print("\nPlease enter a name : ");
        // get user input
        user_input = sc.next();
        
        // error checking 
        if (user_input.equals("zero")) {
            System.out.println("\nInvalid input");
            throw new Exception(failure);
        }

        // print out wha the user entered
        System.out.println("\nyou entered: " + user_input);
        
        return success; // return success string
    }
}