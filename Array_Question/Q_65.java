package Array_Question;

import java.util.Arrays;

public class Q_65 {
    public static void main(String[] args) {
        int arr[]={1,8,-6,9,-19,15,-90};
        int i=0, j= arr.length-1;
        while (i<j){
            while (i< arr.length && arr[i]<0) i++;
            while (j>=0 && arr[j]>0) j--;
            if(i<j){
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
