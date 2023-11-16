/* 
Programmer Name: Johnny Olmedo
Date: 03/26/2022
*/
/**
 * Represents a Checking Account, extending the BankAccount class.
 */
public class CheckingAccount extends BankAccount {
    double interestRate = 0.2;
    double balance;

    /**
     * Displays a negative balance that includes a $30 overdraft fee and denotes that a fee has been accessed.
     */
    public void processWithdrawal() {
        System.out.println("$30 overdraft fee applied to account");
        System.out.println("Balance: " + (getBalance() - 30));
    } 
    
    /**
     * Displays the account summary and applies a fee if the balance is negative, showing the interest rate.
     */
    public void displayAccount() {
        super.accountSummary();
        if (getBalance() < 0) {
            processWithdrawal();
            System.out.print("Interest Rate: " + interestRate);
        }
    }
}

