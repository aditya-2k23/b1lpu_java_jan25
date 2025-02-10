package Day8;
import java.util.Scanner;
import Day6.Middle_man;

public class ATM {
    private static Scanner sc;
    private void ATMOptions(String acctNo, String Pin){
        // Give ATM options and take i/p
        System.out.println("Options");
        System.out.println("1. Check balance");
        System.out.println("2. Credit");
        System.out.println("3. Debit");
        System.out.println("4. Update Pin");
        // int op = sc.nextInt();

    }
    public static void main(String[] args) {
        //it ask the user that he/she want to do cardless transaction or not?
        // take input validate it
        sc = new Scanner(System.in);
        System.out.println("Do you want to do cardless transaction ?(y/n)");
        String ip = sc.nextLine();

        //card less 
        if(ip.equalsIgnoreCase("y")){
            System.out.println("proceding with cardless transaction...");
            //take i/p of acct no and pin validate it and then tell if it's right or not
            System.out.println("Please enter your account number and pin");
            String actNo = sc.nextLine();
            String pin = sc.nextLine();
            Middle_man obj = new Middle_man();
            String name = obj.authForCardLess(actNo, pin);
            if(name.equalsIgnoreCase("No user with such Account no.!"))System.out.println("You have given wrong account no. or pin !");
            else {System.out.println("Welcome "+name+"!");
                // ATM options 
            
            }


        }else if(ip.equalsIgnoreCase("n")){ //card users
            System.out.println("proceding with card transation...");
            // take ip from the use name and pin and then authenticate the user!
            System.out.println("Can you please enter your name and pin");
            String name  = sc.nextLine();
            String pin = sc.nextLine();
            Middle_man obj = new Middle_man();
            String actNo= obj.authForCard(name, pin);
            if(actNo.equals(null))System.out.println("No such user found");
            else {System.out.println("Welcome "+name+"!");
                // ATM options
            }
        }else System.out.println("Wrong input try again");

        sc.close();
        return;
    }   
}
