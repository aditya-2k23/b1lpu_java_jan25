package Day16;

import java.util.ArrayList;
import java.util.Collections;

public class rotateBy1 {
    ArrayList<Integer> rotate(ArrayList<Integer>arr){
        if(arr.size() <= 1)return arr;
        int l = arr.get(arr.size()-1);
        for(int i = arr.size()-1;i>0;i--){
            arr.set(i, arr.get(i-1));
        }
        arr.set(0, l);
        return arr;
    }
    ArrayList<Integer> rotate2(ArrayList<Integer>arr){
        Collections.rotate(arr, 1);
        return arr;
    }
}
