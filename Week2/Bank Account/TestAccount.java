import java.util.*;

public class TestAccount {
    
    public static void main(String[] args) {
    BankAccount myAccount = new BankAccount();
        System.out.println(myAccount.getCheckingBalance());
        System.out.println(myAccount.getSavingsBalance());
        //Deposit 
        myAccount.depositMoney(600,600);

        System.out.println(myAccount.getCheckingBalance());
        System.out.println(myAccount.getSavingsBalance());
        //Total amount CHK and SAV
        System.out.println(BankAccount.totalAmount);
        System.out.printf("$%.2f\n",BankAccount.totalAmount);

        myAccount.withdrawMoney(100,200);
        System.out.println(myAccount.getCheckingBalance());
        System.out.println(myAccount.getSavingsBalance());
        //Withdraw CHK and SAV
    }
}
