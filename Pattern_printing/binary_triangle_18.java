package Pattern_printing;

import java.util.Scanner;
//1
//0 1
//1 0 1
//0 1 0 1


// ye print krna hai
// logic used
// jab jab row mera odd hai to odd column pr 1 hai and even pr 0
// jab row even hai to odd column pr 0 hai and  even column pr 1

public class binary_triangle_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of units: ");
        int u = sc.nextInt();
        for (int i = 1; i <= u; i++) {
            for (int j = 1; j <= i; j++) {
                if(i%2!=0){
                    if(j%2!=0){
                        System.out.print("1 ");

                    }
                    else{
                        System.out.print("0 ");
                    }

                }
                else{
                    if(j%2!=0){
                        System.out.print("0 ");

                    }
                    else{
                        System.out.print("1 ");
                    }
                }



            }

            System.out.println();
        }


    }
}

