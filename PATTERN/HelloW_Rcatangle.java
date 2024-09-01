package PATTERN;

public class HelloW_Rcatangle {
    public static  void hello_rectangle(int toRow, int toCols){
        for (int i = 1; i <=toRow ; i++) {
            for (int j = 1; j <=toCols ; j++) {
                if (i==1 || i==toRow ||j==1 || j==toCols) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }

    }
    public static void main(String[] args) {
        hello_rectangle(4,5);

    }
}
