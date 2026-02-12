package Pattern_printing_special_fig;

import java.util.Scanner;

public class num_tri_verticaly_flip_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of units: ");
        int u = sc.nextInt();

        for (int i = 1; i <= u; i++) {
            int a=1;
            for (int j = 1; j <= u; j++) {
                if ((i + j) >= 5) {
                    System.out.print(a+" ");
                    a++;
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


    }


}
