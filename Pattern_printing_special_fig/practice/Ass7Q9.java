package practice;
import java.util.Arrays;

public class Ass7Q9 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 6, 67, 8, 92, 1, 2, 3, 4, 5, 8};
        System.out.println("Original array: ");
        print(arr);
        System.out.println("Modified array: ");
        bubble(arr);


    }
    public static void print(int arr[]){
        System.out.println(Arrays.toString(arr));// need to import java.util.Arrays
   }
    public static void bubble(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if (arr[j] > arr[j+1]) {
                    int t=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=t;

                }


            }

        }
        print(arr);
    }
}