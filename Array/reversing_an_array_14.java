package Array;

public class reversing_an_array_14 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,7,8,9};
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }// this is called TWO POINTER TECHNIQUE
        for(int k:arr){
            System.out.print(k+" ");
        }
        // if we dont want to revers whole array just a certain part
        // for example from index 3 to 6
        // then?

        // just take i=3 anf j=6 and same
    }
}
