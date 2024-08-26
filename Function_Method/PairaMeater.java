package Function_Method;
import java.util.Scanner;
public class PairaMeater {
    public static void printHello(){
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
    }
    public static  void CalculateSum(int a, int b){
        int sum=a+b;
        System.out.println("Sum is :" + sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        CalculateSum(a,b);
    }
}
