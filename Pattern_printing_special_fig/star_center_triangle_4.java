package Pattern_printing_special_fig;

import java.util.Scanner;

public class star_center_triangle_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of units: ");
        int u = sc.nextInt();
        for (int i = 1; i <= u; i++) {
            for (int j = 1; j<=(u-i) ; j++) {// loop for space
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){// loop for star
                System.out.print("* ");

            }
            System.out.println();
            // upar jitta character  hai neece usse double character  rhega
            // upar space cannot be 0 ...

            // upar 1 space  (char 1)
            // neeche 1 * and 1 space (char 2)

            // upar 2 space  (char 2)
            // neeche 1 * and 3 space (char 4)

            // upar 3 space  (char 3)
            // neeche 1 * and 5 space (char 6)

            // and  so on


        }


    }


}
