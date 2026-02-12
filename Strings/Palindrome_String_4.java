package Strings;

public class Palindrome_String_4 {
    public static void main(String[] args) {
        // to check wethert a given string is palindrome or not
        // we will use two pointer technique
        String str="121";

        if(isPalindrome(str)){
            System.out.println("IS palindrome");

        }
        else System.out.println("NO");




    }
public static boolean isPalindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if (str.charAt(i)!=str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
