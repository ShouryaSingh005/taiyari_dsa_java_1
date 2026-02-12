package Pattern_printing_special_fig;

import java.util.Scanner;

public class pyramid_7 {
    // pyramid is not same as center triangle as
    // in pyramid each row has odd number of * or any entity
    public static void main(String[] args) {
        //        *
        //      * * *
        //    * * * * *
        //  * * * * * * *

        // for this
        //(space = #)
        //1st

        //###
        //##
        //#
        //.

        //2nd

        //*
        //* * *
        //* * * * *
        //* * * * * * *



        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of units: ");
        int u = sc.nextInt();
        for (int i = 0; i <=u-1; i++) {
            for (int j = u-1; j >= i; j--) {// for space
                System.out.print("  ");
            }
            for(int k=1;k<=(i*2)+1;k++){// for *
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}



