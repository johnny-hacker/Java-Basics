/* 
Programmer Name: Johnny Olmedo
Date: 03/26/2022
This program demonstrates inheritance with a bank account transaction
*/

public class BankAccountMain {
    public static void main(String[] args) {

        // Create the checking account object
        CheckingAccount checking_account = new CheckingAccount();
  
        // Load data into the objects using the Person class' method
        checking_account.setFirstName("First Name");
        checking_account.setLastName("Last Name");
        checking_account.setAccountID(7777);
        // balance
        // make a deposit
        checking_account.deposit(500.00);
        // balance
        checking_account.withdrawal(600.00);
        checking_account.displayAccount();
    } 
}
