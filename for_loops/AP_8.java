package for_loops;
import java.util.Scanner;
public class AP_8 {
    public static void main(String[] args){

        for (int n=1;n<=103/4 ;n++){// tn=99+(n-1)*-4= 99-4n+4=103-4n
            int t= 99+(n-1)*-4;     // for term to be +ve
            System.out.println(t);  //tn>=0
                                   // 103-4n>+0
        }                           // n<=103/4....
    }
}
// Methord 2...
// for (int i=99;i>=0;i-=4){
//        System.out.println(i);