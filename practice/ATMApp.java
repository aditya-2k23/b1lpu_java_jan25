package practice;

import java.util.Scanner;

public class ATMApp {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Register to the ATM System");
            System.out.print("Enter your name: ");
            String user = sc.nextLine();

            System.out.print("Set a 4-digit PIN: ");
            int pin = sc.nextInt();

            System.out.print("Enter your account number: ");
            int accountNumber = sc.nextInt();
            sc.nextLine(); // consume the newline

            System.out.print("Enter your mobile number: ");
            String mobileNumber = sc.nextLine();

            ATM atm = new ATM(user, pin, accountNumber, mobileNumber);
            System.out.println("Registration successful!\n");

            while (true) {
                System.out.println("Login to your account or type 'quit' to exit");
                System.out.print("Enter your account number: ");
                String loginAccountNumberInput = sc.nextLine();
                if (loginAccountNumberInput.equalsIgnoreCase("quit")) {
                    break;
                }
                int loginAccountNumber = Integer.parseInt(loginAccountNumberInput);

                System.out.print("Enter your 4-digit PIN: ");
                int loginPin = sc.nextInt();
                sc.nextLine(); // consume the newline

                if (loginAccountNumber == atm.getAccountNumber() && loginPin == atm.getPin()) {
                    System.out.println("\nLogin successful!");

                    System.out.println("Choose an option:");
                    System.out.println("1. Withdraw money");
                    System.out.println("2. Update PIN");
                    System.out.println("3. Update username");
                    System.out.println("4. Update mobile number");
                    System.out.println("5. Logout");
                    int choice = sc.nextInt();
                    sc.nextLine(); // consume the newline

                    switch (choice) {
                        case 1 -> {
                            System.out.print("Enter withdrawal amount: ");
                            double withdrawAmount = sc.nextDouble();
                            if (withdrawAmount > 0) {
                                System.out.println("Withdrawal successful! You withdrew $" + withdrawAmount);
                                System.out.println("Remaining balance: Infinite");
                            } else {
                                System.out.println("Invalid withdrawal amount.");
                            }
                        }
                        case 2 -> {
                            System.out.print("Enter new 4-digit PIN: ");
                            int newPin = sc.nextInt();
                            atm.updatePin(newPin);
                            System.out.println("PIN updated successfully!");
                        }
                        case 3 -> {
                            System.out.print("Enter new username: ");
                            String newUser = sc.nextLine();
                            atm.updateUser(newUser);
                            System.out.println("Username updated successfully!");
                        }
                        case 4 -> {
                            System.out.print("Enter new mobile number: ");
                            String newMobileNumber = sc.nextLine();
                            atm.updateMobileNumber(newMobileNumber);
                            System.out.println("Mobile number updated successfully!");
                        }
                        case 5 -> System.out.println("Logged out successfully!");
                        default -> System.out.println("Invalid choice.");
                    }
                } else {
                    System.out.println("Invalid account number or PIN. Access denied.");
                }
            }
        }
    }
}
