package for_loops;
import java.lang.Math;
import java.util.Scanner;
public class GP_9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n= sc.nextInt();
        for (int i=1;i<=Math.pow(2,(n-1));i=i*2){// an=Math.pow(a,(n-1))
            System.out.println(i);
        }
    }
}
