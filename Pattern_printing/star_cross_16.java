package Pattern_printing;

import java.util.Scanner;

public class star_cross_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of units : ");
        int u = sc.nextInt();
        for (int i = 0; i <= (u-1); i++) {
            for (int j = 0; j <= (u-1); j++) {
                int k =i;
                if (k == j || k==((u-1)-j)) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

    }
}