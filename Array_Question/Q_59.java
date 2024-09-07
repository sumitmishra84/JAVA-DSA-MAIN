package Array_Question;
import java.util.Arrays;
public class Q_59 {
    public static void main(String[] args) {
        int arr[]={10, 20, 30, 40, 50};
        int temp=arr[0];
        for (int i = 0; i < args.length-1 ; i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
        System.out.println(Arrays.toString(arr));
    }
}
