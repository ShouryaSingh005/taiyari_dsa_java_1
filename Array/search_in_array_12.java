package Array;
import java.util.*;

public class search_in_array_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr1={2,5,2,7,89,54,332,2};
        System.out.print("Inter the targeted number to search: ");
        int target=sc.nextInt();
        boolean flag=false;
        int position=0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]==target){
                flag=true;
                // if target existes multiple times then
                position=i;// this will give the last position
                //BUT
                // if we want occorance of first index then just ad break

//                position=i;
//                break;
//

            }

        }
        if(flag){// runs when flag is true
            System.out.print("Target exists");
            System.out.println("at the index "+position);
        }
        else{
            System.out.println("Target does not exists");
        }


    }
}
