package Array_Question;

public class Q_62 {
    public static void main(String[] args) {
        int arr[]={1,5,8,90,10,15};
        int se =90;
        int index=0;
        for (int i = 0; i < arr.length ; i++) {
            if (se==arr[i]){
                index=i;
                break;
            }
        }
        System.out.println(index);
    }
}
