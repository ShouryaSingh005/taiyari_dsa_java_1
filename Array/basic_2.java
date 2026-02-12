package Array;
import java.util.*;
public class basic_2 {
    public static void main(String[] args) {
        // how to take input of size of array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int[] arr = new int[n];


        // how to take input of elements of array

        for (int i = 0; i < arr.length;i++){
            System.out.print("Enter the value of "+i+"th index of array: ");
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length;i++){
            System.out.print(arr[i]+" ");
            // we can also print double of each valur of aray by
            //System.out.print(2*arr[i]+" ");
        }
        System.out.print("Enter the size of n array: ");
        int m=sc.nextInt();
        int []arr3=new int[m];

        for(int i=0;i<arr3.length;i++){
            System.out.print("Enter element of "+i+"th index of the array: ");
            arr3[i]=sc.nextInt();

        }
        System.out.print("{");
        for(int i=0;i<arr3.length;i++){
            System.out.print(+arr3[i]+" ");
        }
        System.out.println("}");





    }
}