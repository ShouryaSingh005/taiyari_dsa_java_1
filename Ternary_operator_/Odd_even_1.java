package Ternary_operator_;
import java.util.Scanner;
public class Odd_even_1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
//        if(n%2==0){
//            System.out.println("Even");
//        }
//        else {
//            System.out.println("Odd");
//        }

        // From ternary operator
        // condition?sach:jhut
        System.out.println((n%2==0)?"Even":"Odd");



    }
}
