package Strings;
import java.util.*;


public class change_the_string_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:");
        String str=sc.nextLine();
        change(str);

    }
    public static void change(String str){
        char ch=str.charAt(0);
        if(Character.isUpperCase(ch)){
            System.out.println(str.toUpperCase());
        }
        else System.out.println(str.toLowerCase());
    }
}
