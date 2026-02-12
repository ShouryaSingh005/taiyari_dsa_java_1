package Pattern_printing;

import java.util.Scanner;

public class alphabate_square_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the ascii of alphabate(65-90): ");
        int r=sc.nextInt();
        System.out.print("Enter the num of column:  ");
        int c=sc.nextInt();
        for(int i=65;i<=r;i++){
            char q=(char)i;
            for(int j=1;j<=c;j++){
                System.out.print(q+" ");
            }
            System.out.println();
        }

    }

}







