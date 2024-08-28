package Conditional_Statement;

import java.util.Scanner;

public class Largest_of_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        if (a>=b && a>=c){
            System.out.println("A is largest");
        } else if (b>=c) {
            System.out.println("largest of b");
        }else {
            System.out.println("largest of c");
        }
    }
}
