package Pattern_printing;

import java.util.Scanner;

public class alphabate_flipped_tri_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of units: ");
        int u = sc.nextInt();
        for (int i = (u+64); i >=65; i--) {
            for (int j =65; j <=i; j++) {
                char q=(char)j;
                System.out.print(q);
            }
            System.out.println();
        }


    }
}







