package Array;
import java.util.Arrays;

public class Shallowcopy_Deepcopy_10 {
    public static void main(String[] args) {
        // SHALLOW COPY:
        // same array hi hoga bus usko ek or nam se call kr payenge
        // if ek array hai arr1 and uska shallow copy bnaye arr2
        // then arr1 and arr2 refers to the same array only
        // arr2 me kuch v change kro to arr1 me v automatically ho jaega
        // coz nya arrayb nai bna hai bus  array ko ek or nam se call kr shakte hai

        // how to make shallow copy....

        int[] arr1={1,2,3,4,5,6};
        int[] arr2=arr1;// arr2 is shallow copy of arr1

        // change is arr2 will refect in arr1 also
        arr2[2]=8;
        System.out.println(arr2[2]);
        //output:8
        System.out.println(arr1[2]);
        //output:8

        // DEEP COPY:
        //this is  like the copy of original
        //yeha actually ek nya array ban rha hai which is simillar to the original array
        //like arr3 is the Deep copy of the array arr1
        // then any change in the arr3 will not affect arr1 and vice-versa

        //How to make deep copy...
        int[] arr3=Arrays.copyOf(arr1,arr1.length);// arr3 is deep copy of arr1
        // for this we need to import java.util.Arrays;
        arr3[2]=9;
        System.out.println(arr3[2]);
        //output:9
        System.out.println(arr1[2]);
        //output:8

        // another way of making deep copy
        int[] arr4=new int[arr1.length];
        for(int i=0;i<arr4.length;i++){
            arr4[i]=arr1[i];
        }
        // now arr4 is also a deep copy of arr1









    }
}

