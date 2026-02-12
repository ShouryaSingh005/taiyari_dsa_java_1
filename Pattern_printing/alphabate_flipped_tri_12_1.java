package Pattern_printing;

import java.util.Scanner;

public class alphabate_flipped_tri_12_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of units: ");
        int u = sc.nextInt();
        for (int i = 65; i <= (u+64); i++) {
            for (int j = (u+64); j >=i ; j--) {
                char q=(char)i;
                System.out.print(q);
            }
            System.out.println();
        }


        // SIMPLEEEEEEEE!!!!!!




    }
}


