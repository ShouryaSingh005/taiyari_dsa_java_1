package If_Else;

import java.util.Scanner;

public class else_if_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        if(n%5==0 && n%3==0){   // use of && (AND)
            System.out.println("Apurva");
        }
        else if(n%3==0){
            System.out.println("Bano");
        }
        else if(n%5==0){
            System.out.println("Riya");
        }
        else if(n%5!=0 || n%3!=0) {   // use of || (OR)
            System.out.println("ISha");
        }
        else{
            System.out.println("Error");
        }

    }
}
