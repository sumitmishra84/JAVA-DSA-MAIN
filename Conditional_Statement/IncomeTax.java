package Conditional_Statement;

import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:=");
        int income= sc.nextInt();
        if (income<5l){
            System.out.println("tax 0%");
        } else if (income<=5l && income<=10l) {
            System.out.println("tax 20%");
            
        }
        else {
            System.out.println("tax 30%");
        }
    }
}
