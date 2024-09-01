package Arrays;

import java.util.Scanner;

public class Input_Output {
    public static void main(String[] args) {
        int marks[]=new int[50];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        marks[0]= sc.nextInt();
        marks[1]= sc.nextInt();
        marks[2]= sc.nextInt();
        marks[3]= sc.nextInt();
        System.out.println("phy :"+ marks[0]);
        System.out.println("che :"+ marks[1]);
        System.out.println("math :"+ marks[2]);
        System.out.println("en :"+ marks[3]);
    }
}
