package Day16;

import java.util.ArrayList;

import java.util.Collections;

public class returnSecondMax {
    int secondMax(ArrayList<Integer>arr){
        // Arrays.sort(arr);
        Collections.sort(arr);
        return (arr.size() > 2 ? arr.get(arr.size()-2) : -1);
    }    
    int secondMax2(ArrayList<Integer>arr){
        int maxi = arr.get(0);
        int sMaxi = -1;
        for(int i = 0 ;i<arr.size();i++){
            if(arr.get(i) > maxi){
                sMaxi = maxi;
                maxi = arr.get(i);
            }
        }
        return sMaxi;
    }
}
