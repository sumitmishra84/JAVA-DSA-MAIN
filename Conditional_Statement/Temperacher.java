package Conditional_Statement;
import java.util.Scanner;
public class Temperacher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: =");
        float temp=sc.nextFloat();
        if (temp>=100){
            System.out.println("temp is above");
        }else {
            System.out.println("tem is not above");
        }
    }
}
