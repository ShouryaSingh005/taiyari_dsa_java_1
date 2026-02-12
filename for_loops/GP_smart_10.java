package for_loops;
import java.util.Scanner;
public class GP_smart_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter va;ue of n: ");
        int n=sc.nextInt();
        int a=1,r=2;
        for (int i=1;i<=n;i++){// here is no use of i it will just run the loop n times
            System.out.println(a);
            a=a*r;

        }
    }
}
