package Conditional_Statement;

import java.util.Scanner;

public class Largest_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: =");
        int a= sc.nextInt();
        int b=sc.nextInt();
        if (a>=25){
            System.out.println("a is largest");
        }else {
            System.out.println("b is largest");
        }
    }
}
