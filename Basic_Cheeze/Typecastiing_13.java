package Basic_Cheeze;

public class Typecastiing_13 {
    // Type casting    CHAR to INT....
    // typecastinig means ek variable type se dushre variable type
    // uski value nikalna like if we want the ASCII value or int value of B then....
    public static void main(String[] args) {
        char Shourya = 'B';
        int S = Shourya;
        System.out.println(S);
// this is called implicid type casting

        char Anushka = 'C';
        int A = (int) Anushka;
        System.out.println(A);
        // this is called explicid tyype casting.
        char Shambhavi = '5';
        System.out.println((int) Shambhavi);
        // this is also calleed explicid type casting

        // ek or tarika ASCAII value nikalne ka !!
        char Kavya = '9';
        System.out.println(Kavya+0);
        // kaise aya
        // ye parenthesis () k andr hai so java apna dimag lgayega as it is print nai krega
        // aab dimag lgaya to smaj aya ki bhai charr me to 0 add hoga nai means
        // ASCAII value + 0 ki bat ho rhi hogi
        // so is the result.....


        char Suman = '7';
        System.out.println(Suman+Suman);
        // here also same reason
        char Atulya = '6';
        System.out.println(Atulya*1);
        // same reason BABY





        //TYPE casting  INT to CHAR....
        int x = 75;
        char Lodu = (char)x;
        System.out.println(Lodu);

        // result is K means ASCAII calue of K is 75..
        int y = 32;
        char land = (char)y;
        System.out.println(land);

        //  nothing comes means 32 is ASCAII value of Space..
    }

}

