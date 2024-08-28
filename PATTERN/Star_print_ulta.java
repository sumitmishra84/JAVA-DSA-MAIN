package PATTERN;
import java.util.Scanner;
public class Star_print_ulta {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a element");
        for (int i = 1; i <=4 ; i++) {
            for (int j = 4; j <=i ; j++) {
                System.out.print(" ");
            }
            for (int k = 4; k >=i ; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
