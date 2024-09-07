package Array_Question;

import java.util.Arrays;

public class Q_61 {
    public static void main(String[] args) {
        int arr[]={1,5,8,90,15};
        int i=0, j= arr.length-1;
        while (i<j){
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
