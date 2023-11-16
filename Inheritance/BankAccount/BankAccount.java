/* 
Programmer Name: Johnny Olmedo
Date: 03/26/2022
Class: CSC 372
Assignment: Module 1 Option 1
*/

import java.util.Scanner;

public class BankAccount {
    
    protected String firstName;
    protected String lastName;
    protected double balance;
    protected int accountID;


   // ***********************************************************************

   // Default constructor 
    public BankAccount() {
        firstName = "";
        lastName = "";
        accountID = 0;
        balance = 0.0; //initialize balance to zero

    } 
  
    // Method to deposit funds into the account
    // will accept a single value double parameter; the parameter value is added to the existing balance
    public void deposit(double deposit) {
        balance = balance + deposit;

    } 
  
    /*Method to withdraw funds from account */
    // accepts a single value double dollar amount; the parameter value is subtracted from the existing balance
    public void withdrawal(double withdrawal) {
        balance = balance - withdrawal;
     
    } 

    //*********************************************************************/
    // Setters and getters for firstName, lastName, and accountID
    // Method to set the first name
    // firstname getter and setter
    public void setFirstName(String gFirstName) {
        firstName = gFirstName;
    }

    // Method to get the first name
    public String getFirstName() {
        return firstName;
    }

    //********************************************************************
    
    // last name getter and setter
    // Method to set Last name
    public void setLastName(String gLastName) {
        lastName = gLastName;
    }
    // method to get last name
    public String getLastName() {
        return lastName;
    }
    
    //********************************************************************

    // account ID getter and setter
    public void setAccountID(int gAccountID) {
        accountID = gAccountID;
    }

    public int getAccountID() {
        return accountID;
    }

    //********************************************************************
    //getter to return the balance

    public double getBalance() {
        return balance;
    }
    
    //*********************************************************************
    // prints all account information
    public void accountSummary() {
        System.out.println("Member Name: " + firstName + " " + lastName);
        System.out.println("Acount ID: " + accountID);
        System.out.println("Balance: " + balance);

    } 
    
}
