package Day14;

public class checkPalindrome {
    void checkPalindrome(String str){
        int i = 0;
        int j = str.length()-1;
        while(i < j){
            if(str.charAt(i) == str.charAt(j)){
                i++;
                j--;
                continue;
            }
            System.out.println("not a palindrome");
            return;
        }
        System.out.println("we have a plaindrome");
        return;
    }
    void checkPalindrome2(String str){
        StringBuffer sb = new StringBuffer(str);
        sb = sb.reverse();
        if(sb.toString().equals(str)){
            System.out.println("we have a palindrome");
        }else System.out.println("Not a plaindrome");
        return;
    }
    public static void main(String[] args) {
        // write logic to check palindrom
    }
}
