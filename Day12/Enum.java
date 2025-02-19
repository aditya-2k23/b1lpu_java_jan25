package Day12;

public class Enum {
    public enum type{
        Savings("Savings"),
        Current("Current");
        private final String val;
        type(String val){
            this.val = val;
        }
        public String getVal(){
            return this.val;
        }
    }
    public static void main(String[] args) {
        type var = type.Savings;
        System.out.println("value of var is "+var);
    }
}
