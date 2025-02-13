package org.example;

//Q4: ATM Simulation with Exception Handling
//Create a class ATM with:
//Balance field
//withdraw(amount), deposit(amount) methods
//Throws InsufficientFundsException if balance is too low.
//Test by depositing and withdrawing different amounts.

public class ATM {
     double Balance = 150;
     double amount;
    class InsufficientFundException extends Exception {
        public InsufficientFundException(String message) {
            super(message);
        }
    }

     void withdraw(int amount) throws InsufficientFundException
    {
        if(Balance > 1000)
        {
            System.out.println("Access Granted! You can withdraw");
        }
        else {
            throw new InsufficientFundException("Insufficient Funds! ");
        }
    }
     void deposit(int amount) throws InsufficientFundException
    {
        if(amount > 500)
        {
            System.out.println("Access Granted! You can Deposit");
        }
        else {
            throw new InsufficientFundException("We accept more than Rs.500 to be deposited");
        }
    }

    public static void main(String[] args) {
        ATM atm1 = new ATM();
        try{
//            atm1.withdraw(1500);
            atm1.deposit(200);
        }
        catch(InsufficientFundException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
