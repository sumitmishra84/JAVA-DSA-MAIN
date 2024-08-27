package FlowChart;
import java.util.Scanner;
public class Max_of_3_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number a:= ");
        int a = sc.nextByte();
        System.out.println("Enter a number b:= ");
        int b = sc.nextInt();
        System.out.println("Enter a number c:= ");
        int c = sc.nextInt();
        if (a > b) {
            if(a>c){
                System.out.println(a);
            }else {
                System.out.println(c);
            }
        }else {
            if (b>c){
                System.out.println(b);
            }else {
                System.out.println(c);
            }
        }
    }
}