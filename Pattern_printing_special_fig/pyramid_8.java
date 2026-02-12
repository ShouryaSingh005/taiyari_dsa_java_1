package Pattern_printing_special_fig;

import java.util.Scanner;

public class pyramid_8 {
    public static void main(String[] args) {

        // methord 3: now we will take 2 variables
        // nsp for number of spacs
        // nst for number of stars


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of units: ");
        int u = sc.nextInt();
        int nsp=u-1;
        int nst=1;
        for (int i = 1; i <=u; i++) {
            for (int j = 1; j <= nsp; j++) {// for space
                System.out.print("  ");
            }
            nsp--;
            for(int k=1;k<=nst;k++){// for *
                System.out.print("* ");
            }
            nst+=2;
            System.out.println();
        }


    }
}


