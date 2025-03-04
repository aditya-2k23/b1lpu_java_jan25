package Day17;

import java.util.*;
public class returnNonDuplicate {
    int nonDuplicate(ArrayList<Integer>arr){
        Collections.sort(arr);
        for(int i = 0;i<arr.size();i++){
            boolean f = false;
            if(i-1 >= 0 && arr.get(i) == arr.get(i-1)){
                f = true;
            }
            if(i+1 < arr.size() && arr.get(i) == arr.get(i+1)){
                f = true;
            }
            if(!f)return arr.get(i);
        }
        return -1;
    }

    int nonDuplicate2(ArrayList<Integer>arr){
        int ans = 0;
        for(int i = 0;i<arr.size();i++){
            ans^=arr.get(i);
        }
        return ans;
    }

}
