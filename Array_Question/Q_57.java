package Array_Question;

public class Q_57 {
    public static void main(String[] args) {
        int arr[]={1,5,8,9,10,15};
        boolean ans=true;
        for (int i = 0; i < arr.length-1 ; i++) {
            if (arr[i]<=arr[i+1]){
                ans=false;
                break;
            }
        }
        System.out.println(ans);
    }
}
