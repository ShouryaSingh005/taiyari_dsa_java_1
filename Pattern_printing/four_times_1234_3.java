package Pattern_printing;

import java.util.Scanner;

public class four_times_1234_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r=sc.nextInt();
        System.out.print("Enter the numbers in each column : ");
        int c=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }

}


