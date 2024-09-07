package Array_Question;

public class Q_56 {
    public static void main(String[] args) {
        int arr[]={2, 96, 69, 77, 145, 20};
        int first=Math.min(arr[0], arr[1]);
        int second=Math.max(arr[0], arr[1]);
        for (int i = 2; i < args.length ; i++) {
            if (arr[i]>first){
                second=first;
                first=arr[i];
            } else if (arr[i]>second) {
                second=arr[i];
            }
        }
        System.out.println(second);
    }
}
