package If_Else;

import java.util.Scanner;

public class absolute_value_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        if(n >= 0) {
            System.out.println(n);
            System.out.println("The Number Was Non Negetive");
        }
        else {
            System.out.println(n*-1);
            System.out.println("The Number Was Negetive");
        }

        //if we dont want to write (elsee) and we want ki bus (if) se kam chal jaye
        // if(n < 0) {
        // n = -n
        // }
        // System.out.println(n);
        // this will check (if) condition if it comes true then n will be assined value of -n
        // then it will print n
        // if the condition of (if) is folse then it will ignore it
        // and just print n
    }
}
