package Pattern_printing_special_fig;

import java.util.Scanner;

public class num_tri_verticaly_flip_5 {
    public static void main(String[] args) {
        // to make
        //      1
        //    1 2
        //  1 2 3
        //1 2 3 4

        // treat space as #
        //1st

        //###
        //##
        //#
        //.

        //2nd
        //1
        //1 2
        //1 2 3
        //1 2 3 4


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of units: ");
        int u = sc.nextInt();
        for (int i = 1; i <= u; i++) {
            for (int j = u-1; j >= i; j--) {// for space
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++){// for numbers
                System.out.print(k+" ");
            }
            System.out.println();
        }


    }


}
