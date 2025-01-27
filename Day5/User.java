package Day5;

public class User {
    private String name;
    private String phnNo;
    private String acctNo;
    private double balance;
    public User(){
        System.out.println("default");
    }
    public User(String  name, String acctNo){
        this.acctNo = acctNo;
        this.name = name;
    }
    // getters
    public String getName(){
        return name;
    }
    public String getPhnNo(){
        return phnNo;
    }
    public String getAccNo(){
        return acctNo;
    }
    public double getBalance(){
        return balance;
    }

    // Setter
    public void setPhnNo(String phnNo){
        this.phnNo = phnNo;
    }
    public  void setBalance(double balance){
        this.balance = balance;
    }
}
