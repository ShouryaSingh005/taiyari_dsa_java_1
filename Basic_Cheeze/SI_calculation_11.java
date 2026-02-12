package Basic_Cheeze;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SI_calculation_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principle Value : ");
        int P =  sc.nextInt();
        System.out.print(" Enter rate : ");
        double R =  sc.nextInt();
        System.out.print(" Enter Time : ");
        int T =  sc.nextInt();
        double SI = (P*R*T)/100;
        System.out.print("The SI sums up to " + SI);

    }
}
