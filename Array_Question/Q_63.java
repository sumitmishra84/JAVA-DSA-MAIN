package Array_Question;

public class Q_63 {
    public static void main(String[] args) {
        int arr[]={1,5,8,9,10,15};
        int search=10;
        int index=-1;
        int start=0, end= arr.length-1;
        while (start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==search){
                index=mid;
                break;
            }
            if (arr[mid]>search){
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        System.out.println(index);
    }
}
