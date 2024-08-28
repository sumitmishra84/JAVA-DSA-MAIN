package Conditional_Statement;

import java.util.Scanner;

public class Positive_and_negative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: =");
        int n= sc.nextInt();
        if (n>0){
            System.out.println("positive number");
        }else {
            System.out.println("negative number");
        }
    }
}
