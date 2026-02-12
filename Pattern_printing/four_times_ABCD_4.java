package Pattern_printing;

import java.util.Scanner;

public class four_times_ABCD_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r=sc.nextInt();
        System.out.print("Enter the ASCII of  last alphabate  in each column (65 to 90): ");
        int c=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=65;j<=c;j++){
                char q=(char)j;
                System.out.print(q+" ");
            }
            System.out.println();
        }

    }

}




