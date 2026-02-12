package Array;
import java.util.Arrays;

public class sorting_array_11 {
    public static void main(String[] args) {
        int[] arr={6,4,5,-6,98,10,-5,-9};
        System.out.println("Original array;");
        print(arr);
        System.out.println("Sorted array;");
        sort(arr);

    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void sort(int []arr){
        Arrays.sort(arr);// sorts array in ascensing order

        print(arr);

    }

}