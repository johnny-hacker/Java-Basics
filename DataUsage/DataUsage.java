/*
Module 2 Option 2
Programmer: Olmedo, Johnny
CSC 320
Submission date: 01/30/2022 
This program detrmines data usage for the user
*/

import java.util.Scanner;

public class DataUsage {
 
    // declare the variables that will be used for the program
    String phone_provider;  // phone provider
    String phone_model; // phone model
    double monthly_minutes;  // how many minutes come with the plan
    double monthly_data; // street address
    double current_minutes; // minutes
    double current_data; // data in GB
    double data_remaining; // data left
    double minutes_remaning; // minutes left
    Scanner sc = new Scanner(System.in);

    // getting and setting phone provider ---------------------------------------------------------------------------------------------
    public String getPhoneProvider() {
        return phone_provider;
    }
 
    public void setPhoneProvider() {
        phone_provider = sc.nextLine();
    }

    // getting and setting phone model ------------------------------------------------------------------------------------------------
    public String getPhoneModel() {
        return phone_model;
    }
 
    public void setPhoneModel() {
        phone_model = sc.nextLine();
    }

    // get and set monthly minutes ------------------------------------------------------------------------------------------------------
    public double getMonthlyMinutes() {
        return monthly_minutes;
    }
 
    public void setMonthlyMinutes() {   
        monthly_minutes = sc.nextDouble();
    } 
    public double getMonthlyData() {
        return monthly_data;
    }
 
    public void setMonthlyData() {
        monthly_data = sc.nextDouble();
    }

    public double getCurrentMinutes() {
        return current_minutes;
    }
 
    public void setCurrentMinutes() {   
        current_minutes = sc.nextDouble();
    }

    // get and set current data usage 
    public double getCurrentData() {
        return current_data;
    }
 
    public void setCurrentData() {  
        current_data = sc.nextDouble();
    }


} 
