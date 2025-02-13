package org.example;


// Q1: Implement a Banking System
//Create a class BankAccount with:
//accountNumber, balance, and ownerName (Encapsulation)
//Methods: deposit(), withdraw()
//Create a subclass SavingsAccount with:
//Additional field: interestRate
//Method: applyInterest()
//Demonstrate method overriding and polymorphism by creating objects and calling methods.


class BankAccount{
    private int accountNumber;
    private double balance ;
    String ownerName;
    public BankAccount(double initialBalance, int AccountNumber, String OwnerName) {
        this.balance = initialBalance;
        this.accountNumber = AccountNumber;
        this.ownerName = OwnerName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }


    void deposit(int rupees)
    {
        System.out.println("UserName :" + " " + getOwnerName());
        System.out.println("Bank Acc No. :" + " " + getAccountNumber());
        System.out.println("Previous Balance" + " " + "Rs."+getBalance());
        double newBalance = balance + rupees;
        balance=newBalance;
        System.out.println("Rs." + rupees + " " + "is deposited in your Bank Account.");
        System.out.println("Updated Balance is :" + "Rs."+newBalance);
        System.out.println("Your Account is now Updated!");
    }
    void withdraw(int rupees)
    {
        System.out.println("UserName :" + " " + getOwnerName());
        System.out.println("Bank Acc No. :" + " " + accountNumber);
        System.out.println("Old Balance" + " " + "Rs."+balance);
        double newBalance = balance - rupees;
        balance=newBalance;
        System.out.println("Rs." + rupees + " " + "is debited from your Bank Account.");
        System.out.println("Remaining Balance is :" + "Rs."+newBalance);
        System.out.println("Your Account is now Updated!");

    }

}

class SavingAcc extends BankAccount{
    double interestRate;
    public SavingAcc(double initialBalance, int AccountNumber, String OwnerName, double interestRate) {
        super(initialBalance, AccountNumber, OwnerName );
        this.interestRate = interestRate;
    }

    double applyInterest()
    {
        return (getBalance()*interestRate)/100;
    }

    @Override
    void withdraw(int rupees) {
        double totalAmount = applyInterest()+rupees;
        System.out.println("The Amount after applying interest Rate is : " + totalAmount);
        setBalance(getBalance()-totalAmount);
    }

    @Override
    void deposit(int rupees) {
        double totalAmount = applyInterest()+rupees;
        System.out.println("The Amount after applying interest Rate is : " + totalAmount);
        setBalance(getBalance()+totalAmount);
    }
}

public class Main {

    public static void main(String[] args) {
//        BankAccount ac1 = new BankAccount(10,5150,"Gursidak");
//        ac1.getBalance();
//        ac1.deposit(10);
//        ac1.withdraw(10);
//        System.out.println();
        BankAccount ac2 = new SavingAcc(100,7156,"RISHU RAJ",10);
        System.out.println("User Name: " + ac2.getOwnerName());
        System.out.println("Account Number: " + ac2.getAccountNumber());
        System.out.println("Current Balance: " + ac2.getBalance());
        ac2.deposit(100);
        ac2.withdraw(100);

    }
}