package Array;
import java.util.*;
public class only_negetive_elemts_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < arr.length;i++){
            System.out.print("Enter the value of "+i+"th index of array: ");
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length;i++){
            if(arr[i]<0){
                System.out.print(arr[i]+" ");
            }
        }

    }
}
