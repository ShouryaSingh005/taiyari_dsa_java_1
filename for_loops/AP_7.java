package for_loops;
import java.util.Scanner;
public class AP_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of terms: ");
        int n=sc.nextInt();
//
//        for (int i=1;i<=n;i++){
//            int a=2;
//            int d=3;
//            int t=a+(i-1)*d;
//            System.out.println(t);
//        }
        // easy and more logical way is ...
        for (int i=2;i<=3*n-1;i=i+3){// last term(tn)=a+(n-1)d
            System.out.println(i);    // here tn=2+(n-1)3=3(n-1)
        }
    }
}
