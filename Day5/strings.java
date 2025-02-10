package Day5;

class Mohit{
    private static Mohit obj = null;
    private Mohit(){
        System.out.println("default");
    }
    static Mohit getObject(){
        if(obj != null)return obj;
        obj = new Mohit();
        return obj;
    }
}

public class strings {
    public static void main(String[] args) {
        Mohit obj = Mohit.getObject();
        obj.equals(obj);
       String str = "Mohit";
        System.out.println(str);
        String s2 = new String("Mohit");
        System.out.println(str.equalsIgnoreCase(s2));
    }
}
