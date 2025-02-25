package Day14;

import java.util.Arrays;

public class Anagram {
    void isAnagram(String s1,String s2){
        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        s1 = arr1.toString();
        s2 = arr2.toString();
        if(s1.equals(s2)){
            System.out.println("anagrams");
        }else System.out.println("not anagrams");
    }
}
