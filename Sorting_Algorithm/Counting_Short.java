package Sorting_Algorithm;
import java.lang.reflect.Array;
public class Counting_Short{
    public  static void CountingShort(int arr[]){
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
    public  static  void CountingSort(int arr[]){
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
    public  static void Insertion_Sort(int arr[]){
        for (int i = 1; i < arr.length ; i++) {
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>arr[curr]){
                arr[prev+1] =arr[prev];
                prev--;
            }
            arr[prev+1]=curr;

        }
    }
    public static void countingSourt(int arr[]){
        int largest=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            largest =Math.max(largest,arr[i]);
        }
        int count[]=new int[largest+1];
        for (int i = 0; i < arr.length ; i++) {
            count[arr[i]]++;
        }
        //sorthing
        int j=0;
        for (int i = 0; i <count.length ; i++) {
            while (count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={6,4,1,3,2};
        CountingSort(arr);
        printArr(arr);

    }
}

