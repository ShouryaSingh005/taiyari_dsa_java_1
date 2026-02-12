package for_loops;
import java.util.Scanner;
public class Check_if_composit_14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        for (int i=2;i<=(n-1);i++){
            if(n%i==0) {
                System.out.println("Composite number...");
                break;

            }
            else {
                    System.out.println("prime number");
                    break;

                }

        }

    }
}
