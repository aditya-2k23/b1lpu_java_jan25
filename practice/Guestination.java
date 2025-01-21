package practice;

import java.util.Scanner;

public class Guestination {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int b = (int) (Math.random() * 100);
        boolean flag = true;

        while (flag) {
            System.out.println("Enter a number between 0 and 100: ");
            int a = s.nextInt();

            if (a < 0 || a > 100) {
                System.out.println("Invalid input. Please enter a number between 0 and 100.");
                continue;
            }

            if (a == b) {
                System.out.println("You guessed it right!");
                System.out.println("Do you want to play again? (yes/no)");
                String response = s.nextLine();
                if (response == "no") {
                    flag = false;
                } else {
                    b = (int) (Math.random() * 100);
                }
            } else if (a > b) {
                System.out.println("Your guess is too high!");
            } else {
                System.out.println("Your guess is too low!");
            }
        }
    }
}
