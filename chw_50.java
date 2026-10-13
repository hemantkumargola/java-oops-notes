
// 50. Real-Life Example of All Four OOP Principles
// Example: Banking System

/*
The four OOP principles are:

1. Encapsulation
2. Inheritance
3. Polymorphism
4. Abstraction
*/


// 1. ABSTRACTION
// Hides implementation details and shows essential features.

abstract class BankAccount {

    // 2. ENCAPSULATION
    // Data is private and accessed through public methods.

    private String accountHolder;
    private double balance;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        } else {
            System.out.println("Invalid amount or insufficient balance.");
        }
    }

    // Abstract method: subclasses provide their own implementation.
    public abstract void calculateInterest();
}


// 3. INHERITANCE
// SavingsAccount inherits properties and methods
// from BankAccount.

class SavingsAccount extends BankAccount {

    SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    // 4. POLYMORPHISM
    // Method overriding: the child class provides its own behavior.

    @Override
    public void calculateInterest() {
        double interest = getBalance() * 0.04;
        System.out.println("Savings account interest: " + interest);
    }
}


class CurrentAccount extends BankAccount {

    CurrentAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void calculateInterest() {
        System.out.println("Current accounts have no interest in this example.");
    }
}


public class chw_50 {

    public static void main(String[] args) {

        SavingsAccount savings =
                new SavingsAccount("Rahul", 10000);

        System.out.println("Account holder: "
                + savings.getAccountHolder());

        savings.deposit(2000);
        savings.withdraw(1000);

        System.out.println("Balance: "
                + savings.getBalance());

        System.out.println();

        // Runtime polymorphism:
        // A BankAccount reference can refer to a SavingsAccount object.
        BankAccount account = new SavingsAccount("Amit", 20000);
        account.calculateInterest();

        // Same parent reference type, different child object behavior.
        account = new CurrentAccount("Priya", 15000);
        account.calculateInterest();
    }
}


/*
OUTPUT:

Account holder: Rahul
Amount deposited: 2000.0
Amount withdrawn: 1000.0
Balance: 11000.0

Savings account interest: 800.0
Current accounts have no interest in this example.


EXPLANATION OF ALL FOUR OOP PRINCIPLES:

1. ENCAPSULATION
   The accountHolder and balance variables are private.
   They are accessed through public methods.
   This helps control access to account data.

2. INHERITANCE
   SavingsAccount and CurrentAccount extend BankAccount.
   They reuse its common properties and methods.

3. POLYMORPHISM
   Both child classes override calculateInterest().
   The method behavior depends on the actual object
   at runtime.

4. ABSTRACTION
   BankAccount is an abstract class.
   It defines calculateInterest() without providing
   its implementation.
   Each child class implements the method differently.


INTERVIEW ANSWER:

A banking system is a real-life example of all four
OOP principles.

Encapsulation protects account data using private
variables and public methods.

Inheritance allows SavingsAccount and CurrentAccount
to reuse features from BankAccount.

Polymorphism allows different account types to provide
different implementations of calculateInterest().

Abstraction hides implementation details and defines
common behavior through an abstract BankAccount class.
*/ 