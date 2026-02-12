package If_Else;

import java.util.Scanner;

public class check_if_integer_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        double n = sc.nextDouble();
        int x = (int)n;  // type casting used
        if(x == n) {
            System.out.println(" The number is an Integer");
        }
        else{
            System.out.println("Not an Integer");
        }
    }
}
