package Pattern_printing_special_fig;

import java.util.Scanner;

public class star_triangle_vertically_flipped_3 {
    // methord 2:
    // ek loop k andr do or loop
    // observe: har line me star v ho rha and space v print ho rha
    // so we will observe pattern of space and star individually
    //      *
    //    * *
    //  * * *
    //* * * *

    //treating space as #

    // here we have to make 2 loop
    //1st for
    //###
    //##
    //#
    //.

    //and 2nd for

    //*
    //**
    //***
    //****


    // conclude: ek line ko print krne k liye 2 loop lenge
    // ek jo mera space print krega individually
    // or dushra jo mera star print krega individually
    // dono ko print kr denge without using (ln)
    // so same line me ho jayega
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of units: ");
        int u = sc.nextInt();
        for (int i = 1; i <= u; i++) {
            for (int j = u-1; j>=i ; j--) {// loop for space
                System.out.print("  ");
            }
            for (int k=1;k<=i;k++){// loop for star
                System.out.print("$ ");

            }
            System.out.println();
            // aab ese me agar space wle me se ("  ") ek space hta de i.e (" ")
            // and star wle me rehne de i.e ("* ")
            // to center triangle print hoga
        }


    }

}
