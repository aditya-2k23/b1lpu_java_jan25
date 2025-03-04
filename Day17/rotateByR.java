package Day17;

public class rotateByR {
    int[] rotate(int arr[],int i,int j){
        while(i < j){
            int v = arr[i];
            arr[i] = arr[j];
            arr[j] = v;
            i++;
            j--;
        }
        return arr;
    }
    int[] rotateByR(int arr[],int r){
        // rotate the entire array
        arr = rotate(arr,0,arr.length-1);
        // rotate from 0 till r-1
        arr = rotate(arr,0,r-1);
        // rotate from r till n-1
        arr = rotate(arr,r,arr.length-1);
        return arr;
    }
}
