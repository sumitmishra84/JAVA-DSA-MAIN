package Loop;

import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        int cout=1;
        while (cout<=n){
            System.out.println(cout+ " ");
            cout++;
        }
    }
}
