package Array;

import java.util.Arrays;

public class basic_1 {
    public static void main(String[] args) {


        // declaring an array
        // syntax;
        // datatype[] name_of_array = {values}


        int[] arr1 = {2, 4, -8, 7, 5};
        // indexing
        System.out.println(arr1[3]); // accessing value at an index
        //updating value of an index
        arr1[3] = 121;
        System.out.println(arr1[3]);


        // another way of declaring an arrray
        // syntax;
        // datatype[] name_of_array = new datatype[size]


        int[] arr2 = new int[5];
        arr2[0] = 5;
        arr2[1] = 21;
        arr2[2] = 34;
        arr2[3] = 55;
        arr2[4] = 78;

        // finding length(size) of an array
        System.out.println(arr1.length);


        // printing an array:
        // this is wrong... (i<=arr2.length)

        //for (int i=0;i<=arr2.length;i++){
        //            System.out.println(arr2[i]+" ");
        //        }


        // this is right...(i<arr2.length)

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i] + " ");
        }
        // for printing array in single line
         System.out.println(Arrays.toString(arr2));// need to import java.util.Arrays


        // default values of an array
        // agar array declare krr diye and koi value nai dale to by default kya value hot hai?
        // the value is zero (0)
        // eg...
        int[] arr3 = new int[5];
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i] + " ");
        }


        // output :
        //0
        //0
        //0
        //0
        //0


    }
}
