package Pattern_printing;

import java.util.Scanner;

public class alternate_alphabate_triangle_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of units: ");
        int u = sc.nextInt();
        int a=65;
        int b=97;
        for (int i = 1; i <= u; i++) {
            for (int j = 1; j <= i; j++) {
                char c=(char)a;
                char d=(char)b;
                if(i%2!=0){
                    System.out.print(c+" ");
                    a++;
                    b++;
                }
                else{
                    System.out.print(d+" ");
                    a++;
                    b++;
                }
            }

            System.out.println();
        }


    }

}
