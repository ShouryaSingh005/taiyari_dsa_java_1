package Pattern_printing;

import java.util.Scanner;

public class Flipped_triangle_10 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number of units: ");
//        int u = sc.nextInt();
//        for (int i = u; i >= 1; i--) {
//            for (int j = i; j >= 1; j--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        // itta maths nai lag rha to simply we will use one more variable
        // if u = 5 then
        // 1st line me  5 *
        // 2nd me 4 *
        //3rd me 3 *  so on
        // so we will take a variable int a=u
        // we will print (a) in each line
        // then we will decrement the value of (a) i.e (a--) after each iteration of loop



        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of units: ");
        int u = sc.nextInt();
        int a=u;
        for (int i = 1; i <= u; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.print("* ");
            }
            a--;
            System.out.println();
        }


        // SIMPLEEEEEEEE!!!!!!




    }
}



