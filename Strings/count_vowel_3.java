package Strings;
import java.util.*;

public class count_vowel_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:");
        String str=sc.nextLine();
        countVowel(str);
    }
    public static int countVowel(String str){
        int count=0;
        String vowels="AEIOUaeiou";
        for(int i=0;i<str.length();i++){
            for(int j=0;j<vowels.length();j++){
                if(str.charAt(i)==vowels.charAt(j)){
                    count++;
                }
            }
        }
        System.out.println(count);
        return count;
    }
}
