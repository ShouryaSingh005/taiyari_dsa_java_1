package If_Else;
import java.util.Scanner;

public class AND_OR_four_digit_or_not_6 {
    public static void main(String[] args) {
        //&&= AND ( run when both true), ||= OR(run when any one or both is true)
        Scanner sc=new Scanner(System.in);
        System.out.print("Input the number: ");
        int n=sc.nextInt();
        if(n>999&&n<10000){
            System.out.println("Four digit num");

        }
        else{
            System.out.println("not a four digit number");
        }
    }
}
