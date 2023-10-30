/*

Programmer: Olmedo, Johnny

Submission date: 01/23/2022 

This program gathers information about a fictional character then prints it out
*/

import java.util.Scanner;

public class FictionalInfo {
    public static void main (String [] args) {
    // try opening this scanner 
    try (Scanner sc = new Scanner(System.in)) {
        // declare the variables that will be used for the program
            String firstName;  // first name
            String lastName;  // last name
            String streetAddress; // street address
            String city; // city
            int zipCode; // zip code

            // begin taking down information for fictional person
            // start with first name
            System.out.println("Please enter fictional persons first name: ");
            firstName = sc.nextLine();
            // get last name
            System.out.println("Please enter fictional persons last name: ");
            lastName = sc.nextLine();
            // get street address
            System.out.println("Please enter fictional persons street address: ");
            streetAddress = sc.nextLine();
            // get city
            System.out.println("Please enter fictional persons city: ");
            city = sc.nextLine();
            // get zip code
            System.out.println("Please enter fictional persons zip code: ");
            zipCode = sc.nextInt();
 
            // print out all the information gathered
            System.out.println("Here is all the information gathered about thois fictional person:");
            // print first name
            System.out.println("First Name : " + firstName);
            // print last name
            System.out.println("Last Name : " + lastName);
            // print street address
            System.out.println("Street Address : " + streetAddress);
            // print city
            System.out.println("City : " + city);
            // print zip code
            System.out.println("Zip Code: " + zipCode);
        }
    }
 }