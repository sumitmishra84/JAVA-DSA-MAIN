package Arrays;

import java.util.Scanner;

public class Basic{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a size :=");
        int size= sc.nextInt();
        System.out.println("Enter a data");
        int arr[]=new int[size];
        for (int i = 0; i < arr.length ; i++) {
           arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
