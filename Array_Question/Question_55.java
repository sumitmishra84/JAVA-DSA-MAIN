package Array_Question;

public class Question_55 {
    public static void main(String[] args) {
        int arr[]={2, 96, 69, 77, 145, 20};
        int max=0;
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i]>arr[max]) {
                max = i;
            }
        }
        System.out.println("max ="+arr[max]+ "found at"+max);
    }
}
