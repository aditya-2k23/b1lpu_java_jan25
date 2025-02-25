package Day14;

public class revisitTobuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hey my name is mohit");
        sb.insert(5," cj ");
        System.out.println(sb.toString());
        sb.replace(5, 6, "null");
        System.out.println(sb.toString());
    }
}
