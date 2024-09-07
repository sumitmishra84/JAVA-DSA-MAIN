package Array_Question;
import java.util.Scanner;
public class Question_54{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a size :=");
            int size= sc.nextInt();
            System.out.println("Enter a data");
            int arr[]=new int[size];
            for (int i = 0; i < arr.length ; i++) {
                arr[i]=sc.nextInt();
            }
            int sum=0;
            for (int i = 0; i < arr.length ; i++) {
                sum +=arr[i];
            }
            System.out.println("sum = " +sum);
            System.out.println("avg = "+(double)sum/ arr.length);
        }
}


