package Switch_Case;

import java.util.Scanner;

public class Leep_Year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Year :=");
        int year= sc.nextInt();
        boolean x=(year%4==0);
        boolean y=(year%100!=0);
        boolean z=((year%100 ==0) &&(year%400 ==0));
        if (x &&(y||z)){
            System.out.println(year+"is a leep year");
        }else {
            System.out.println("not leep year");
        }


    }
}
