package for_loops;

public class alphabate_with_ascii_12 {
    public static void main(String[] args) {
        for( int i=65;i<=90;i++){
            char j=(char)i;
            System.out.print(j+": ");
            System.out.println(i);
        }
        System.out.println("Now for lower case ...");
        for( int i=97;i<=122;i++){
            char j=(char)i;
            System.out.print(j+": ");
            System.out.println(i);
        }
    }
}
