package Array;

public class rotating_counter_clock_wise_16 {

        // reverse  counter clock-wise  arr1={1,2,3,4,5,6,7,8,9} with position 3
        // so we need 4,5,6,7,8,9,1,2,3
        // first reverse the whole
        //then reverse the position 1 to last-3 i.e index 0 to arr.length-4
        // thrn reverses the remainung index i.e arr.length-3 to last
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

        // reversoing position 1 to last -3
        rev(arr1,0,arr1.length-4);

        // reversing position 4 to last
        rev(arr1,arr1.length-3,arr1.length-1);




        // print the array
        for(int k:arr1){
            System.out.print(k+" ");
        }



    }
    }
