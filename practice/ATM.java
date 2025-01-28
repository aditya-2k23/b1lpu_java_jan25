package practice;

public class ATM {
    private String user;
    private int pin;
    private int accountNumber;
    private String mobileNumber;

    public ATM(String user, int pin, int accountNumber, String mobileNumber) {
        this.user = user;
        this.pin = pin;
        this.accountNumber = accountNumber;
        this.mobileNumber = mobileNumber;
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

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setDetails(String user, int pin, int accountNumber, String mobileNumber) {
        this.user = user;
        this.pin = pin;
        this.accountNumber = accountNumber;
        this.mobileNumber = mobileNumber;
    }

    public void updatePin(int newPin) {
        this.pin = newPin;
    }

    public void updateUser(String newUser) {
        this.user = newUser;
    }

    public void updateMobileNumber(String newMobileNumber) {
        this.mobileNumber = newMobileNumber;
    }
}
