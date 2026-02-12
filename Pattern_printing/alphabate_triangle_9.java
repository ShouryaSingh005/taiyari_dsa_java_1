package Pattern_printing;

import java.util.Scanner;

public class alphabate_triangle_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the ascii of last alphabate(65-90): ");
        int u = sc.nextInt();
        for (int i = 65; i <= u; i++) {
            for (int j = 65; j <= i; j++) {
                char q=(char)j;
                System.out.print(q);
            }
            System.out.println();
        }


    }
}




