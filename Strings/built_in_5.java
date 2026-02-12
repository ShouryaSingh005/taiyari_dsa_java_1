package Strings;

public class built_in_5 {
    public static void main(String[] args) {
        String str ="Saxy Shourya and suar Aastha!";
        System.out.println(str.indexOf('a')); // returns the index of first occurance
        //output:1
        System.out.println(str.lastIndexOf('a'));// returns the index of last occurance
        // output:27
        // and both return -1 if that character is not present
        System.out.println(str.toLowerCase());// converts whole string to lower case
        System.out.println(str.toUpperCase());// converts whole string to Upper case
        System.out.println(str.contains("and"));// returns true or false is the original string
        // i.e "Saxy Shourya and suar Aastha!" contains the substring "and"
        System.out.println(str.startsWith("Sho"));// returns true or false is the original string
        // i.e "Saxy Shourya and suar Aastha!" starts with  the substring "Sho"
        System.out.println(str.endsWith("tha!"));// same as starts with
        // COMPARE TO :
        // syntax: (str1).compareTo(str2)
        // compares two string str1 and str2 lexographically which means on the basis of ascii values
         // if str1 = "abcd" ; str2 = "abgf"
        // it will compare the first letters that is "a" and "a" as it is same so there
        // ascii value is same so it will move to the next letter that is "b" and "b"
        // it is also same so it will move to the third letter that is
        // "c" and "g" here is the difference in ascii value so it will ignore
        //the rest of the character of both the strings and will return the difference of ascii value of
        // str1 and str2
         // summary::
        // compared ascii value
        // returns str1-str2
        String s="O ma gu ";
        String ss="turu lob";
        System.out.println((s).compareTo(ss));
        //output:-37 i.e.
        // ascii of "O" - ascii  of "t"
        // agar str1 and str2 are totally same them difference will be 0



        //.







    }
}
