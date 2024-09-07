package Array_Question;

import java.util.Arrays;
import java.util.Scanner;

public class Q_58 {
    public static void main(String[] args) {
        int arr[]={1, 5, 8,  90, 10, 15 };
        int temp[]=new int[arr.length];
        int j=0;
        int i = arr.length-1;
        while (i >=0) {
            temp[j++]=arr[i--];
        }
        System.out.println(Arrays.toString(temp));
    }
}
