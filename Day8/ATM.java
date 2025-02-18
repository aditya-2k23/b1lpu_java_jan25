package Day8;
import java.util.Scanner;
import Day6.Middle_man;

public class ATM {
    private static Scanner sc = null;
    private static Middle_man obj = null;
    private static void ATMOptions(String acctNo, String Pin){
        while(true){
        // Give ATM options and take i/p
            System.out.println("Options");
            System.out.println("1. Check balance");
            System.out.println("2. Credit");
            System.out.println("3. Debit");
            System.out.println("4. Update Pin");
            int op = sc.nextInt();
          
        //Switch case
        // make case for each option
        // if anything else apart from these options are given then print wrng input
            int amount = 0;
            switch(op){
                case 1:
                System.out.println("checking balance");
                System.out.println("your current balance is "+obj.getBalance(acctNo));
                break;
                case 2:
                System.out.println("Crediting..");
                amount = sc.nextInt();
                if(obj.credit(acctNo, amount)){
                    System.out.println("amount credited, updated balance is "+obj.getBalance(acctNo));
                }else System.out.println("not able to perform the operation");
                break;
                case 3:
                System.out.println("Debiting..");
                amount = sc.nextInt();
                if(obj.debit(acctNo, amount)){
                    System.out.println("amount debited, updated balance is "+obj.getBalance(acctNo));
                }else System.out.println("not able to debit the amount");
                break;
                case 4:
                System.out.println("updating pin...");
                String nPin = sc.nextLine();
                if(obj.changePin(acctNo, Pin, nPin)){
                    System.out.println("updated the pin");
                }else System.out.println("not able to update the pin");
                break;
                default:
                System.out.println("You have given a wrng choice!");
            }
            sc.nextLine();
            System.out.println("Do you want to continue ?(y/n)");
            String flag = sc.nextLine();
            if(flag.equalsIgnoreCase("n"))break;
        }
    }
    public static void main(String[] args) {
        //it ask the user that he/she want to do cardless transaction or not?
        // take input validate it
        sc = new Scanner(System.in);
        System.out.println("1. Cardless trans ?");
        System.out.println("2. Card trans");
        System.out.println("3. Do you want to create an account ?");
        String ip = sc.nextLine();

        //card less 
        if(ip.equalsIgnoreCase("1")){
            System.out.println("proceding with cardless transaction...");
            //take i/p of acct no and pin validate it and then tell if it's right or not
            System.out.println("Please enter your account number and pin");
            String actNo = sc.nextLine();
            String pin = sc.nextLine();
            obj = new Middle_man();
            Middle_man obj2 = new Middle_man();
            String name = obj.authForCardLess(actNo, pin);
            if(name.equalsIgnoreCase("No user with such Account no.!"))System.out.println("You have given wrong account no. or pin !");
            else {System.out.println("Welcome "+name+"!");
                // ATM options 
                ATMOptions(actNo,pin);
            }


        }else if(ip.equalsIgnoreCase("2")){ //card users
            System.out.println("proceding with card transation...");
            // take ip from the use name and pin and then authenticate the user!
            System.out.println("Can you please enter your name and pin");
            String name  = sc.nextLine();
            String pin = sc.nextLine();
            obj = new Middle_man();
            String actNo= obj.authForCard(name, pin);
            if(actNo.equals(null))System.out.println("No such user found");
            else {System.out.println("Welcome "+name+"!");
                // ATM options
                ATMOptions(actNo,pin);
            }
        }else if(ip.equalsIgnoreCase("3")){
            System.out.println("creating account...");
            //API
            String name = sc.nextLine();
            double b = sc.nextDouble();
            String pin = sc.nextLine();
            String actNo = null;
            if(name != null && pin != null)actNo = obj.createAccount(name,b,pin);
            else System.out.println("Wrong input!");
            System.out.println("Your account number is "+actNo);
        }
        else System.out.println("Wrong input try again");

        sc.close();
        return;
    }   
}
