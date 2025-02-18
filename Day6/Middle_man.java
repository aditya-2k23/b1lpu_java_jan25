package Day6;

import java.util.ArrayList;
import java.util.Arrays;

import Day5.User;
public class Middle_man {
    // make dynamic in future
    // int arr[]= new int[3];
    private static User arr[] = new User[3];
    private static ArrayList<User> arr2= new ArrayList<>();
    // initilizer block
    static{
        System.out.println("init block");
        /* Way1 */
        arr2.add(new User("Aryan","1","6969",101010));
        arr2.add(new User("Medha","2","1234",9999999));
        arr2.add(new User("Abhi","3","0007",9999998));

        /* convert this array into list using Arrays.asList(arr) way2
        arr[0] = new User("Aryan","1","6969",101010);
        arr[1] = new User("Medha","2","1234",9999999);
        arr[2] = new User("Abhi","3","0007",9999998);*/


    }

    public Middle_man(){
        System.out.println("Default const");
    }
    // Authantication for Cardless user
    public String authForCardLess(String acNo, String Pin){  
        for(int i = 0 ;i<arr2.size();i++){
            User user = arr2.get(i);
            if(user.getAccNo().equalsIgnoreCase(acNo) && user.getPin().equalsIgnoreCase(Pin))return user.getName();}

        return "No user with such Account no.!";
    }

    // Authantication for card users
    public String authForCard(String name,String Pin){
        for(int i = 0 ;i<arr2.size();i++){
            User user = arr2.get(i);
            if(user.getName().equalsIgnoreCase(name) && user.getPin().equalsIgnoreCase(Pin))return user.getAccNo();}
        return null;
    }

    // Methods to update balance for the user
    public boolean debit(String acNo,int val){
        for(int i = 0 ;i<arr2.size();i++){
            User user = arr2.get(i);
            if(user.getAccNo().equalsIgnoreCase(acNo)){
                double balance = user.getBalance();
                if(balance < val)return false;
                user.setBalance(balance-val);
            }
        }
        return true;
    }
    public boolean credit(String acNo,int val){
        for(int i = 0 ;i<arr2.size();i++){
            User user = arr2.get(i);
            if(user.getAccNo().equalsIgnoreCase(acNo)){
                double balance = user.getBalance();
                user.setBalance(balance+val);
            }
        }
        return true;
    }

    // update pin method
    public boolean changePin(String acNo,String oldPin,String newPin){
        if(oldPin.equalsIgnoreCase(newPin))return false;
        
        for(int i = 0 ;i<arr2.size();i++){
            User user = arr2.get(i);
            if(user.getAccNo().equalsIgnoreCase(acNo)){            
                user.setPin(newPin);
            }
        }
        return true;
    }

    // to get the balance of the user
    public double getBalance(String acNo){
        for(int i = 0 ;i<arr2.size();i++){
            User user = arr2.get(i);
            if(user.getAccNo().equalsIgnoreCase(acNo)){
                return user.getBalance();
            }
        }
        return 0;
    }

    // create an account and this return the account number of the user after creating the account
    public String createAccount(String name,double b,String pin){
        Integer i = arr2.size()+1;
        arr2.add(new User(name,i.toString(),pin,b));
        return i.toString();
    }

}
