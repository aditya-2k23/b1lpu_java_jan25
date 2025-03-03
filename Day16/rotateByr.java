package Day16;

public class rotateByr {
    int[] rotateByR(int arr[],int r){
        int narr[] = new int[arr.length];
        for(int i = 0 ;i<arr.length;i++){
            narr[(i+r)%arr.length] = arr[i];
        }
        return narr;
    }
}
