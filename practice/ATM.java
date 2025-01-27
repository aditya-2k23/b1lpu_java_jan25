package practice;

import java.util.Scanner;

public class ATM {
    private String user;
    private int pin;
    private int accountNumber;

    public ATM(String user, int pin, int accountNumber) {
        this.user = user;
        this.pin = pin;
        this.accountNumber = accountNumber;
    }

    public String getUser() {
        return user;
    }

    public int getPin() {
        return pin;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setDetails(String user, int pin, int accountNumber) {
        this.user = user;
        this.pin = pin;
        this.accountNumber = accountNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Register to the ATM System");
        System.out.print("Enter your name: ");
        String user = sc.nextLine();

        System.out.print("Set a 4-digit PIN: ");
        int pin = sc.nextInt();

        System.out.print("Enter your account number: ");
        int accountNumber = sc.nextInt();

        ATM atm = new ATM(user, pin, accountNumber);
        System.out.println("Registration successful!\n");

        System.out.println("Login to your account");
        System.out.print("Enter your name: ");
        sc.nextLine();
        String loginUser = sc.nextLine();

        System.out.print("Enter your 4-digit PIN: ");
        int loginPin = sc.nextInt();

        if (loginUser.equals(atm.getUser()) && loginPin == atm.getPin()) {
            System.out.println("Login successful!");
            System.out.print("Enter withdrawal amount: ");
            double withdrawAmount = sc.nextDouble();

            if (withdrawAmount > 0) {
                System.out.println("Withdrawal successful! You withdrew $" + withdrawAmount);
                System.out.println("Remaining balance: Infinite");
            } else
                System.out.println("Invalid withdrawal amount.");
        } else
            System.out.println("Invalid username or PIN. Access denied.");

        sc.close();
    }
}
