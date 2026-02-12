package Array;

public class data_type_String_8 {
    public static void main(String[] args) {
        // char is used to store single letter character data
        //eg:
        char ch='w';
        System.out.println(ch);
        //output: w
//        char ch='warm';
//        System.out.println(ch);
        // error
        // for storing multi letter character we need string data type

        String s="i love u";
        System.out.println(s);
        // output: i love u

        // String me "S" hmesa capital hota hai

        // we can also store diffrent types of data in array
        int[] arr1=new int[5];
        // or
        // int arr1[]={1,3,5,7,9};


        //double


        //double[] arr2=new double[5];
        // or
        double arr2[]={1,3,5,7,9};

        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println(); // for changing line before below codes


        // char


        //char[] arr3=new char[5];
        // or
        char arr3[]={'b','r','t'};

        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }
        System.out.println();

        // String..

        //String [] arr4=new String[5];
        // or
        String arr4[]={"hello","hii"," . "};

        for(int i=0;i<arr4.length;i++){
            System.out.print(arr4[i]+" ");
        }





    }


}
