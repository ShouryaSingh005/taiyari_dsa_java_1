package Pattern_printing;

import java.util.Scanner;



public class star_plus_15 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of units: ");
            int u = sc.nextInt();
            int k=(u+1)/2;
            if (u%2==0){
                System.out.println("No star plus pattern possible");
            }
            else{
                for (int i = 1; i <= u; i++) {
                    for (int j = 1; j <= u; j++) {
                        if(i==k || j==k){
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
    }