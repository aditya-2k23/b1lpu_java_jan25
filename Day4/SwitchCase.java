package Day4;

public class SwitchCase {
    public static void main(String[] args) {
        var val = 'c';
        switch (val) {
            case 1:
                System.out.println("inside case 1");
                break;
            case 2:
                System.out.println("inside case 2");
            break;

            default:
            System.out.println("inside a default case!");
                break;
        }
    }
}
