package Pattern_printing_special_fig;

import java.util.Scanner;

public class star_triangle_vertically_flipped_1 {
    // methord 1 : jab koi badiya pattern dikh jaye
    // jaise yeha i+j wla dik gya
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of units: ");
        int u = sc.nextInt();
        for (int i = 1; i <= u; i++) {
            for (int j = 1; j <= u; j++) {
                if ((i + j) >= 5) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }


            }
            System.out.println();
        }


    }

}
