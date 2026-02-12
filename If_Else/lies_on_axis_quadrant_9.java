package If_Else;
import java.util.Scanner;
public class lies_on_axis_quadrant_9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("x= ");
        int x=sc.nextInt();
        System.out.println("y= ");
        int y=sc.nextInt();
        if(x==0&&y==0){
            System.out.println("on origin");
        }
        else if(x==0&&y!=0){
            System.out.println("lies on y axis");
        }
        else if(x!=0&&y==0){
            System.out.println("lies on x axis");
        }
        else if(x>0&&y>0){
            System.out.println("1st quadrant");
        }
        else if(x>0&&y<0){
            System.out.println("4th quadrant");
        }
        else if(x<0&&y>0){
            System.out.println("2nd quadrant");
        }
        else if(x<0&&y<0){
            System.out.println("3rd quadrant");
        }
    }
}
