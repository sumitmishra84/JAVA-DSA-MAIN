package Array_Question;

public class Q_57 {
    public static void main(String[] args) {
        int arr[]={1, 8, 6, 9, 10, 15};
        boolean ans=false;
        for (int i = 0; i < arr.length-1 ; i++) {
            if (arr[i]<=arr[i+1]){
                ans=true;
                break;
            }
        }
        System.out.println(ans);
    }
}
