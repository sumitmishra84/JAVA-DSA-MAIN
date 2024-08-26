package Sorting_Algorithm;
import java.lang.reflect.Array;
public class Selection_Short {
    public  static void bubbleShort(int arr[]){
        for (int turns = 0; turns < arr.length-1 ; turns++) {
            for (int j = 0; j < arr.length-1 ; j++) {
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static  void printArr(int arr[]){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public  static  void selectionSort(int arr[]){
        for (int i=0; i< arr.length-1; i++){
            int minPosition=i;
            for (int j =i+1; j < arr.length; j++) {
                if(arr[minPosition]>arr[j]){
                    minPosition=j;
                }
            }
            //swap
            int temp =arr[minPosition];
            arr[minPosition]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        selectionSort(arr);
        printArr(arr);

    }
}

