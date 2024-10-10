package LinearSearch;

public class LinearSearch {
    static int LinearSearch(int arr[],int key, int index){
     if (index== arr.length-1) return -1;
     else  if(arr[index]==key) return  index;
     return  LinearSearch(arr, key, index+1);
    }
    public static void main(String[] args) {
        int arr[]={15, 8, 9};
        int idx=LinearSearch(arr, 15, 0);
        if (idx>=0){
            System.out.println("Element is found"+ idx+" index");
        }
        else System.out.println("not found");
    }
}
