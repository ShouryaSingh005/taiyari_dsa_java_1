package Array;

import java.util.Scanner;

public class sum_of_array_element_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value of " + i + "th index of array: ");
            arr[i] = sc.nextInt();
        }
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];


        }
        System.out.println(sum);
    }

}
