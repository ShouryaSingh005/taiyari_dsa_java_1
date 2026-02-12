package If_Else;
import java.util.Scanner;
public class least_of_3_num_13 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("First num: ");
        int a=sc.nextInt();
        System.out.println("Second num: ");
        int b=sc.nextInt();
        System.out.println("Third num: ");
        int c=sc.nextInt();
        if(a<=b){
            //aab b sbse chota nai hai
            if(a<=c) System.out.println(a);
            else//c<a
                System.out.println(c);
        }
        else{
            // b<a
            // a sbse chota nai

            if(b<=c) System.out.println(b);
            else//c<b
                System.out.println(c);
        }

    }
}
