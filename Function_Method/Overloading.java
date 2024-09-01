package Function_Method;

public class Overloading {
    //function to calc sum of two number
    public static int sum(int a, int b){
        return  a+b;
    }
    //function of calc sum of three number
    public  static  int sum(int a, int b, int c){
        return  a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(sum(3,5));
        System.out.println(sum(5,2,1));
    }
}
