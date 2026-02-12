package for_loops;
import java.util.Scanner;
public class Pattern_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("n: ");
        int n=sc.nextInt();
        for (int i=1;n>=1;i++){
            System.out.println(i);
            System.out.println(n);
            n-=1;
            }


    }
}
