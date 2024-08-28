package Switch_Case;

import java.util.Scanner;

public class Button {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        switch (n){
            case 1:System.out.println("samosa");
            case 2: System.out.println("burger");
            case 3:System.out.println("pizza");
            default:
                System.out.println("weal up");


        }
    }
}
