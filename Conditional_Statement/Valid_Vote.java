package Conditional_Statement;
import java.util.Scanner;
public class Valid_Vote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: =");
        int a= sc.nextInt();
        if (a>=18){
            System.out.println("valid vote");
        } else if (a>=13 && a<18) {
            System.out.println("Tiniger");
        }else {
            System.out.println("not valid vote");
        }
    }
}
