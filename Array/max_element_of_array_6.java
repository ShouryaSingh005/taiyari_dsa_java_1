package Array;

import java.util.Scanner;

public class max_element_of_array_6 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] arr = new int[4];
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Enter the value of " + i + "th index of array: ");
                arr[i] = sc.nextInt();
            }
            int max=0;
            for (int i = 0; i < arr.length; i++) {
                if (max<arr[i]) {
                    max=arr[i];
                }
            }
            System.out.println(max);
            // but isme ek scope of error hai i.e
        // agar sare elemt -ne hue and hamne max ko initialoize kiya hai 0
        // then 0 hi sbse bda hoga
        // so best is
        // take max as any value of the array
        // int max=arr[0] or calue of any index

        //int max=arr[1];
        //            for (int i = 0; i < arr.length; i++) {
        //                if (max<arr[i]) {
        //                    max=arr[i];
        //                }
        //            }
        //            System.out.println(max);

    }
    // one more  thing we can do
    // upar dikkatt ye aa rha  tha ki agar 0 se chota elemt hua array me to garbar ho jayega
    //  so we can initialize max as the minimun value of int(according to java)
    // eg...
    //int max=Integer.MIN_VALUE;

}
