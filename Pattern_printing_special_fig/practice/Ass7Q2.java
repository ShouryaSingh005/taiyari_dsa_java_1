package practice;
import java.util.*;

public class Ass7Q2 {

    public static void main(String[] args) {
        int count[]=new int[101];
        readarray(count);
        Print(count);

    }
    public static void readarray(int count[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number between 1 to 100(0 to stop): ");

        while(true){
            int n=sc.nextInt();
            if(n==0) break;
            if(n>=1&&n<=100)
                count[n]++;
            else System.out.println("Invalid Input!!");
        }

    }
    public static void Print(int count[]){
        for(int i=0;i<count.length;i++){
            if(count[i]>0){
                System.out.println("The number "+i+"occurs "+count[i]+" times.");
            }
        }

    }

}
