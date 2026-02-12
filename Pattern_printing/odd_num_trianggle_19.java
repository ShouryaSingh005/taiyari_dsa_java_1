package Pattern_printing;

import java.util.Scanner;

public class odd_num_trianggle_19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of units: ");
        int u = sc.nextInt();

        for (int i = 1; i <= u; i++) {
            for (int j = 1; j <= (i * 2) - 1; j += 2) {
                System.out.print(j + " ");

            }


            System.out.println();
        }


    }
}






