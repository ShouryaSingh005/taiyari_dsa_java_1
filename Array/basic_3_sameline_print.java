package Array;
import java.util.Arrays;
public class basic_3_sameline_print {
    public static void main(String[] args) {


        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        // for printing in next lines
        for (int i = 0; i < arr.length;i++){
            System.out.println(arr[i]);
        }
        //Output:
        //1
        //2
        //3
        //4
        //5
        //6
        //7
        //8
        //9
        //0
        // for printing array in single line
        System.out.println(Arrays.toString(arr));// need to import java.util.Arrays
        //Output:
        //[1, 2, 3, 4, 5, 6, 7, 8, 9, 0]


    }
}