package If_Else;
import java.util.Scanner;
public class greatest_of_3_num_10 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("First num: ");
        int N1=sc.nextInt();
        System.out.println("Second num: ");
        int N2=sc.nextInt();
        System.out.println("Third num: ");
        int N3=sc.nextInt();
        if(N1>=N2&&N1>N3) System.out.println(N1);
        else if(N2>=N1&&N2>=N3) System.out.println(N2);
        else if(N3>=N2&&N3>N1) System.out.println(N3);

    }
}
