package If_Else;
import java.util.Scanner;
public class greatest_of_3_num_12 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("First num: ");
        int N1=sc.nextInt();
        System.out.println("Second num: ");
        int N2=sc.nextInt();
        System.out.println("Third num: ");
        int N3=sc.nextInt();
        if(N1>=N2){
            //aab N2 sbse bda nai ho shkta either N1 or N3
            if(N1>=N3) System.out.println(N1);

            else System.out.println(N3);
        }


        else{
            //if not N1>N2 then ofcouese N2>N1
            // aab N1 sbse bda nai hoga to N2 or N3
            if(N2>=N3) System.out.println(N2);
            else System.out.println(N3);


        }




    }

}
