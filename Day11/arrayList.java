package Day11;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        ArrayList<Integer> arr2= new ArrayList<>(5);
        arr.add(10);
        arr.add(12);
        arr.add(13);

        arr.get(2);
        for(int i = 0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }

    }
}
