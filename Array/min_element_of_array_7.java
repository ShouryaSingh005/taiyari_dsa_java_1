package Array;

import java.util.Scanner;

public class min_element_of_array_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value of " + i + "th index of array: ");
            arr[i] = sc.nextInt();
        }
        int min =Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min >arr[i]) {
                min =arr[i];
            }
        }
        System.out.println(min);
    }
}
