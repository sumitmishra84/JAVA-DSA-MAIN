package FlowChart;
import java.util.Scanner;
public class Simple_Intrest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a amount(principe):= ");
        int p= sc.nextInt();
        System.out.println("Enter a rate(rate):= ");
        int r= sc.nextInt();
        System.out.println("Enter a time(time):= ");
        int t= sc.nextInt();
        int si=(p*r*t)/100;
        System.out.println("find the simple interest:=" +si);
    }
}
