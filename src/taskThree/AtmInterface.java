/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskThree;

import java.util.Scanner;

/**
 *
 * @author mercy
 */
public class AtmInterface implements AtmOperations {
    private BankAccount account;
    private Scanner scanner;

    public AtmInterface(BankAccount account) {
        this.account = account;
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("Welcome to the ATM");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    @Override
    public void run() {
        OUTER:
        while (true) {
            displayMenu();
            System.out.print("Select an option: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    checkBalance();
                    break;
                case "2":
                    {
                        System.out.print("Enter the deposit amount: $");
                        double amount = Double.parseDouble(scanner.nextLine());
                        deposit(amount);
                        break;
                    }
                case "3":
                    {
                        System.out.print("Enter the withdrawal amount: $");
                        double amount = Double.parseDouble(scanner.nextLine());
                        withdraw(amount);
                        break;
                    }
                case "4":
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break OUTER;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

    @Override
    public void checkBalance() {
        System.out.println("Balance: $" + account.getBalance());
    }

    @Override
    public void deposit(double amount) {
        if (account.deposit(amount)) {
            System.out.println("Deposit successful. New balance: $" + account.getBalance());
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (account.withdraw(amount)) {
            System.out.println("Withdrawal successful. New balance: $" + account.getBalance());
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
    
     public void close() {
        scanner.close();
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);
        AtmInterface atm = new AtmInterface(account);
        atm.run();
        atm.close(); // Close the scanner when the program is done.
    }
        
}
 

  
