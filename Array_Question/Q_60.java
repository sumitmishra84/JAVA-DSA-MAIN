package Array_Question;

import java.util.Arrays;

public class Q_60 {
    public static void main(String[] args) {
        int arr[]={1,5,7,8,10,15};
        int k=7;
        k=k% arr.length;
        while (k-->0){
            int temp=arr[0];
            for (int i = 0; i < arr.length-1 ; i++) {
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]=temp;
        }
        System.out.println(Arrays.toString(arr));

    }
}
