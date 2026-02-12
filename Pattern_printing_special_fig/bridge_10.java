package Pattern_printing_special_fig;

import java.util.Scanner;

public class bridge_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of units: ");
        int u = sc.nextInt();
        int a=u-1;
        int b=u-1;
        for (int n=1;n<=(u*2)-1;n++){
            System.out.print("* ");
        }
        System.out.println();

        for (int i=1;i<=u-1;i++){
            for (int j = 1; j <= a; j++) {
                System.out.print("* ");
            }
            a--;
            for(int k=1;k<=(i*2)-1;k++){
                System.out.print("  ");
            }
            for (int l = 1; l <= b; l++) {
                System.out.print("* ");
            }
            b--;

            System.out.println();

        }
    }
}





