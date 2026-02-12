package Pattern_printing;

import java.util.Scanner;

public class star_rectrangle_filledwith_hash_13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r=sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int c=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i==1 || i==r || j==1 || j==c){
                    System.out.print("* ");
                }
                else{
                    System.out.print("# ");
                }

            }
            System.out.println();
        }
        //* * * * *
        //* # # # *
        //* # # # *
        //* # # # *
        //* * * * *

        // for this we will use if else like
        // if(first row OR last row OR first column OR last column)
        // then print(*);
        // else
        // print (#);


        // AAB jaise ye hua waise hi hollow rectrangle v ho jayega bus # k jagah sapce(" ") print kr denge

    }

}


