import java.util.*;

public class BankAccount{
    //Class/member variables belong to object of the class. Show what bank accounts
    private double checkingAccount;
    private double savingsAccount;

    //Static variables belong to the class
    public static int numberOfAccounts = 0;
    public static double totalAmount = 0;
    
    //Constructor increment the account count
    public BankAccount(){
        BankAccount.numberOfAccounts++; 
    }

    //Getter/Accessors method for user's checking account balance
    public double getCheckingBalance(){
        return this.checkingAccount;
    }

    //Getter method for user's savings account balance
    public double getSavingsBalance(){
        return this.savingsAccount;
    }

    //Method allows user to deposit money into either checking or savings and added to the total amount stored.
    public void depositMoney(double checkingAccountDeposit, double savingsAccountDeposit){
        this.checkingAccount += checkingAccountDeposit;
        this.savingsAccount += savingsAccountDeposit;
        BankAccount.totalAmount += (checkingAccountDeposit + savingsAccountDeposit);
    }

    //Method to withdraw from one balance, no insufficient funds
    public void withdrawMoney(double checkingAccountWithdraw, double savingsAccountWithdraw){
        boolean SufficientFundsCheckingAccount = false;
        boolean SufficientFundsSavingsAccount = false;

        if(this.checkingAccount >= checkingAccountWithdraw){
            this.checkingAccount -= checkingAccountWithdraw;
            SufficientFundsCheckingAccount = true;
            // BankAccount.total -= checkingAccountWithdraw;
        }
        else {
            System.out.println("Insufficient Funds Checking.");
        }

        if(this.savingsAccount >= savingsAccountWithdraw){
            this.savingsAccount -= savingsAccountWithdraw;
            SufficientFundsSavingsAccount = true;
            // BankAccount.total -= savingsAccountWithdraw;
        }
        else {
            System.out.println("Insufficient Funds Savings.");
        }

    }
    //Create a method to see the total money from the checking and saving. For entire bank.
    public void displayTotalAmount(){
        System.out.printf("$%.2f\n",BankAccount.totalAmount);
    }

    //Users should not be able to set any of the attributes from the class.
    private void 
}