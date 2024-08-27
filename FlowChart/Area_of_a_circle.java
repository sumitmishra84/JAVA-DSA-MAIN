package FlowChart;
import java.util.Scanner;
public class Area_of_a_circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a radius of a circle:= ");
        double r=sc.nextDouble();
        double area=Math.PI*r*r;
        System.out.println(area);
    }
}
