package Day12;

public class Enum {
    // replica of a classs using enums
    public enum type{
        Savings("saving"),
        Current("current");
        private String val;
        type(String val){
            this.val = val;
        }
        public String getVal(){
            return this.val;
        }
    }

    // List of const
    public enum Types{
        Savings,Current;
    }

    public static void main(String[] args) {
        type var = type.Savings;
        System.out.println("value of var is "+var);
    }
}
