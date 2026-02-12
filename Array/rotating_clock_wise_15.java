package Array;

public class rotating_clock_wise_15 {
    //- Clockwise rotation by 3 position (right shift): clock moves in right directoin so right ka 3 ement moves to left
    //Example: [1,2,3,4,5,6,7,8,9,10] → after 3 steps → [8,9,10,1,2,3,4,5,6,7]
    //- Anticlockwise rotation  by 3 position (left shift): here left ka 3 moves to right
    //Example: [1,2,3,4,5,6,7,8,9,10] → after 3 steps → [4,5,6,7,8,9,10,1,2,3]



    // reverse clock-wise  arr1={1,2,3,4,5,6,7,8,9} with position 3
    // so we need 7,8,9,1,2,3,4,5,6
    // first reverse the whole
    //then reverse the position 1 to 3 i.e index 0 to 2
    // thrn reverses the remainung index i.e 3 to last
    public static void rev(int[] arr,int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

    }

    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6,7,8,9};
        // reversing whole array
        rev(arr1,0,arr1.length-1);

        // reversig position 1 to 3
        rev(arr1,0,2);

        // reversing position 4 to last
        rev(arr1,3,arr1.length-1);

        // print the array
        for(int k:arr1){
            System.out.print(k+" ");
        }



    }
}
