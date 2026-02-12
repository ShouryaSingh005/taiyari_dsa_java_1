package Array;

public class Problem1 {
    public static void main(String[] args) {
        int[] arr1={2,3,4,5,6,7,8,9};
        for(int i=0;i<arr1.length;i++){
            if (i%2!=0){
               arr1[i]*=2;
            }
            else {
                arr1[i]+=10;
            }

        }
        print(arr1);
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
