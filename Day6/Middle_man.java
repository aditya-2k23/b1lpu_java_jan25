package Day6;
import Day5.User;
public class Middle_man {
    // make dynamic in future
    private User user = new User("Aryan","1","6969");

    // Authantication for Cardless user
    public String authForCardLess(String acNo, String Pin){
        if(user.getAccNo().equalsIgnoreCase(acNo) && user.getPin().equalsIgnoreCase(Pin))return user.getName();
        return "No user with such Account no.!";
    }

    // Authantication for card users
    public String authForCard(String name,String Pin){
        if(user.getName().equalsIgnoreCase(name) && user.getPin().equalsIgnoreCase(Pin))return user.getAccNo();
        return null;
    }

    // Methods to update balance for the user
    public boolean debit(String acNo,int val){
        double balance = user.getBalance();
        if(balance < val)return false;
        user.setBalance(balance-val);
        return true;
    }
    public boolean credit(String acNo,int val){
        double balance = user.getBalance();
        user.setBalance(balance+val);
        return true;
    }

    // update pin method
    public boolean changePin(String acNo,String oldPin,String newPin){
        if(oldPin.equalsIgnoreCase(newPin))return false;
        user.setPin(newPin);
        return true;
    }

}
