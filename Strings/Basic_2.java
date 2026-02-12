package Strings;

public class Basic_2 {
    public static void main(String[] args) {
        // ascessing an character at a certain index of an String
        String jay="Shourya loves Aastha suar";
        // here 0 to 6 index is shourya
        // 7 is space
        // 8 to 12 is loves
        //13 is space
        // 14 to 19 is Aastha
        // 20 is space
        // 21 to 24 is suar
        // if we want to print 21th index then "stringname.charAt(index)"
        System.out.println(jay.charAt(21)); // output: s

        // we can ascess the size of String by "stringname.length()"
        int size=jay.length();
        System.out.println(size);


    }
}
