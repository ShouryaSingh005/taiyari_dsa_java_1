package Basic_Cheeze;

public class Incement_Decrement_14 {
    public static void main(String[] args) {
        int x,y,z;
        x = 5;
        y = 7;
        z = 9;
        // if we want to update value
        x += 6;   // means [x = x + 6]
        System.out.println(x);   // here  comes 11
        y -= 3;    // means [y = y - 3]
        z *= 4;    // means [z = z * 4]
        System.out.println(y+" "+z);
        // 4 and 36 comes as expected


        // if u want to increse value of x by 1 we have 3 ways

        System.out.println(x); // x = 11
        x = x+1;
        System.out.println(x); // x = 12
        x += 1;
        System.out.println(x);  // x = 13
        x++;  // or [++x]
        System.out.println(x);  // x = 14
// so by all these way we can increse 1
        // similarly [--x]  or [x--]  will decrese value by 1

        //!!!! BUT system.out.print()  yeha bracket k andr agar x++  ya ++x ya --x ya x--
        // likha to iska matlab alag hai
        //System.out.println();  iske andr
        // System.out.println(x++);  means  print x then increse valuue of x by 1
        // System.out.println(++x);  means increse value of x by 1 then print
        // System.out.println(--x);  means decrese value of x by 1 then print
        // System.out.println(x--);  means print x then decrese value of x by 1
        x = 5;
        System.out.println(x++); // print 5 then increses x by 1
        System.out.println(x);  // print 6{ as x is incesesd by 1}
        System.out.println(--x); // decrese x by 1 then print 5
        System.out.println(x); // print 5
        System.out.println(x--); // print 5 then dec by 1
        System.out.println(x); // print 4
    }


}
