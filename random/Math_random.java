package random;

public class Math_random {
    public static void main(String[] args) {
//        🔹 How Math.random() Works
//                - Math.random() returns a double between 0.0 (inclusive) and 1.0 (exclusive).
//                - To get an integer, you multiply this value by a range and then cast it to int.
//
//        🔹 General Formula for Integers
//        int randomInt = (int)(Math.random() * range) + start;
//
//
//         range → the number of possible values.
        // IMP: [range = stop - start +1 ]

//         start → the starting value
//         🔹 Examples
//1. Random integer between 0 and 9
        // here start is 0
        // stop is 9
        // range is 9 - 0 + 1 = 10

//int randomInt = (int)(Math.random() * 10);
//System.out.println(randomInt);
//
//
//- Output: any integer from 0 to 9.


//2. Random integer between 1 and 10
        // start = 1
       // stop =10

//int randomInt = (int)(Math.random() * 10) + 1;
//System.out.println(randomInt);
//
//
//- Output: any integer from 1 to 10.
//
// 3. Random integer between 50 and 100

//int randomInt = (int)(Math.random() * (100 - 50 + 1)) + 50;
//System.out.println(randomInt);
//
//
//- Output: any integer from 50 to 100.
//
// 4. Random integer between -20 and +20


//int randomInt = (int)(Math.random() * (20 - (-20) + 1)) + (-20);
//System.out.println(randomInt);
//
//
//- Output: any integer from -20 to 20..
//
   }
}


