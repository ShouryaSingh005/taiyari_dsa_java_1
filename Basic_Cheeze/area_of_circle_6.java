package Basic_Cheeze;

import java.util.Scanner;

public class area_of_circle_6 {
    public static void main(String[] args) {
     double formula = Math.PI;// 3.14 bhi likh shkte the but for pi we use Math.PI
        Scanner s = new Scanner(System.in);

        System.out.print("Enter your Fucking value: ");
     double r = s.nextDouble();
        System.out.println("Area of circle is "+formula*r*r);
        double A = formula*r*r;// aise v kr shkte hai
        System.out.println(A);
        // agar ham code hai code me change na kre bar bar and ki frount end pr seedhe
        // r ka value bhre and area aa jaye to
        // r ke value ko scane krna hoga for that ek scanner bnana hoga
        // by writing Scanner (name of scanner) = new Scanner(System.in)
        // and r ki value ko ye scanner dena hoga
        // r = (name od scanner).nextDouble()
        // Double bcoz data type of r is double
        // we would have written Int if data type of r woubl be int

    }
}
