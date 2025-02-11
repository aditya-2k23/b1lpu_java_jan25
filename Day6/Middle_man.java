package Day6;

import Day5.User;

public class Middle_man {

    // make dynamic in future
    private final User user = new User("Aryan", "1", "6969");

    // Authentication for Card-less user
    public String authForCardLess(String acNo, String Pin) {
        if (user.getAccNo().equalsIgnoreCase(acNo) && user.getPin().equalsIgnoreCase(Pin)) {
            return user.getName();
        }
        return "No user with such Account no.!";
    }

    // Authentication for card users
    public boolean authForCard(String name, String Pin) {
        return user.getName().equalsIgnoreCase(name) && user.getPin().equalsIgnoreCase(Pin);
    }

    // Methods to update balance for the user
    public boolean debit(User obj, int val) {
        double balance = obj.getBalance();
        if (balance < val) {
            return false;
        }
        obj.setBalance(balance - val);
        return true;
    }

    public boolean credit(User obj, int val) {
        double balance = obj.getBalance();
        obj.setBalance(balance + val);
        return true;
    }
}
