package Strings;
import java.util.*;
public class Basics_1 {
    public static void main(String[] args) {
        String str="I love your THAT...";
        System.out.println(str);
      //   taking input of sting

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sting: ");
        // two ways
        // String s= sc.next() it will only concider untill the first space occurs
        //and
        // String s= sc.nextLins()   this will take concider the whole String
         String s= sc.nextLine();
        System.out.println(s);
        //Output:lets have sex baby
//        System.out.println("Enter the Sting: ");
//        String S= sc.next();
//        System.out.println(S);
        //Output:lets


    }

}
